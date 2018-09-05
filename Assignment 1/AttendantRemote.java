import java.util.List;

public class AttendantRemote
{

	public void turnOffLights(List<Seat> A)
	{
		for (Seat B : A)
		{
			B.turnLightOff();
		}
	}
}
