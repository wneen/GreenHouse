package deu.greenhouse.ar;

import jp.androidgroup.nyartoolkit.utils.gl.AndGLView;
import jp.nyatla.nyartoolkit.and.R;
import android.graphics.Bitmap;

public class InfoCircleHumidity extends InfoCircle{
		
	public InfoCircleHumidity(AndGLView i_context, IGLPlane plane,
			float i_size_x, float i_size_y, float i_size_z, int textSize) {
		super(i_context, plane, i_size_x, i_size_y, i_size_z, textSize);
		// TODO Auto-generated constructor stub
	}
	
	public void draw(float i_x,float i_y,float i_z)
	{
		Boolean state;
		int id;
		String infoText;
		
		state = this.getButtonState();
		infoText = DoubleValtoString(12.5)+"%";
		
		if(state == false) {
			id = GetBitmapForResourceId(R.drawable.humidityoff);
		}
		else {
			id = GetBitmapForResourceId(R.drawable.humidityon);
		}
		 
		
		super.draw(i_x, i_y, i_z, id, infoText);
	}	
}
