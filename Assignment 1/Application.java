import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application
{

	static List<Seat> seats = new ArrayList<>();
	static int choice = 0;
	static Scanner in = new Scanner(System.in);
	static AttendantRemote remote = new AttendantRemote();

	public static void main(String Args[])
	{
		List<Seat> Seats = new ArrayList<>();

		for(int i = 0; i < 5; i++)
		{
			Seat seat = new Seat();
			seats.add(seat);
		}


			mainMenu();

	}

	public static void mainMenu()
	{

		while(choice != 3)
		{
			System.out.println("1. Guest Menu");
			System.out.println("2. Attendant Menu");
			System.out.println("3. Quit");
			System.out.println("Selection: ");
			choice = in.nextInt();
			switch(choice)
			{
				case 1:
					guestMenu();
					break;
				case 2:
					attendantMenu();
					break;

			}
		}
	}

	public static void guestMenu()
	{
		while(choice != 5)
		{
			System.out.println("4. Call Attendant");
			System.out.println("5. Main Menu");
			System.out.println("Selection: ");
			choice = in.nextInt();
			switch(choice)
			{
				case 4:
					System.out.println("Seat Number: ");
					choice = in.nextInt();
					seats.get(choice - 1).turnLightOn();
					choice = 5;
					break;


			}
		}

	}

	public static void attendantMenu()
	{
		while(choice != 7)
		{
			System.out.println("6. Turn Off All Lights");
			System.out.println("7. Main Menu");
			System.out.println("Selection: ");
			choice = in.nextInt();
			switch(choice)
			{
				case 6:
					remote.turnOffLights(seats);
					choice = 7;
					break;
			}
		}
	}


}
