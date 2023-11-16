import time
import serial
import serial.tools.list_ports
import requests
from bs4 import BeautifulSoup

def sf(data):
    sendData = f"FND={data}\n"
    my_serial.write( sendData.encode() )
    
def get_exchange_rate(target1, target2):
    headers = {
        'User-Agent': 'Mozilla/5.0',
        'Content-Type': 'text/html; charset=utf-8'
    }
    response = requests.get("https://kr.investing.com/currencies/{}-{}".format(target1, target2), headers=headers)
    
    content = BeautifulSoup(response.content, 'html.parser')
   
    containers = content.find('span', {'data-test': 'instrument-price-last'})
    print(containers.text)

    
def main():
    try:
        while True:
            print()
            sf(get_exchange_rate('usd', 'krw'))
            time.sleep(60.0 * 5)
    except KeyboardInterrupt: pass
    
if __name__ == '__main__':
       ports = list(serial.tools.list_ports.comports())
       for p in ports:
           if 'Arduino Uno' in p.description:
               print(f"{p} 포트에 연결하였음.")
               my_serial = serial.Serial(p.device, baudrate=9600, timeout=1.0)
               time.sleep(2.0)
                
       main()
        
       my_serial.close()