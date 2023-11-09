package InnerInterface;

public class Button {
	
	OnClickKistener listener;
	
	void SetOnClickKistener(OnClickKistener listener) {
		this.listener = listener;
	}
	
	public void touch() {
		listener.onClick();
	}
	
	public interface OnClickKistener {
		
		void onClick();

	}

	
}
