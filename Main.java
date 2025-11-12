import java.util.Random;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		Random random = new Random;

		int userScore=0;
		int ComputerScience = 0;
		int rounds = 3;

System.out.println("Welcome to Rock,Paper,Scissors Game!);
System.out.println("You will play"+ "rounds against the computer\n");
		

		for (int i = 0; i <= rounds; i++) {
			System.out.println("Round" +i+ ":");
			System.out.println("Enter your choice(rock,paper,scissors):");
			String userChoice = sc.nextLine().toLowerCase();
			
		//computer's choice
		int compNum = random.nextInt(3);
		String computerChoice = (compNum == 0)? "rock":(compNum ==1)?"paper":"scissors";
		System.out.println("Computer Chose:" + computerChoice);


			
		JButton btn_paper = new JButton(" ", new ImageIcon(icon_path[1]));
		btn_paper.setBackground(Color.yellow);
		btn_paper.setBounds(icon_bound[1], 100, 200, 250);

		JButton btn_scissors = new JButton(" ", new ImageIcon(icon_path[2]));
		btn_scissors.setBackground(Color.blue);
		btn_scissors.setBounds(icon_bound[2], 100, 200, 250);

		JToggleButton toggle_button = new JToggleButton("Light Mode");
		ItemListener itemListener = new ItemListener() {
			public void itemStateChanged(ItemEvent itemEvent) {
				int state = itemEvent.getStateChange();
				if (state == ItemEvent.SELECTED) {
					frame_main.getContentPane().setBackground(Color.WHITE);
					title_main.setForeground(Color.BLACK);
					toggle_button.setText("Dark Mode");
				} else {
					frame_main.getContentPane().setBackground(Color.BLACK);
					title_main.setForeground(Color.WHITE);
					toggle_button.setText("Light Mode");
					toggle_button.setBackground(Color.white);
				}
			}
		};
		toggle_button.addItemListener(itemListener);
		toggle_button.setBounds(570, 20, 150, 40);

		panel_main.add(toggle_button);
		panel_main.add(btn_rock);
		panel_main.add(btn_scissors);
		panel_main.add(btn_paper);
		panel_main.add(title_main);

		btn_rock.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				compute_winner(1);
			}
		});

		btn_paper.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				compute_winner(2);
			}
		});

		btn_scissors.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				compute_winner(3);
			}
		});
		frame_main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame_main.setSize(800, 400);
		frame_main.setVisible(true);
	}

	public static void compute_winner(int choice_human) {
		int choice_computer = (int) (Math.random() * 3) + 1;
		String label_choice, label_winner = "";
		String combo_winner = "" + Math.min(choice_computer, choice_human) + Math.max(choice_computer, choice_human);
		switch (Integer.parseInt(combo_winner)) {

			case 12:
				label_choice = "Paper wins!";
				if (choice_human == 2)
					score_human = 1;
				break;
			case 13:
				label_choice = "Rock wins!";
				if (choice_human == 1)
					score_human = 1;
				break;
			case 23:
				label_choice = "Scissors wins!";
				if (choice_human == 3)
					score_human = 1;
				break;
			default:
				label_choice = "It is a tie!";
				score_human = 2;
				score_tie += 1;
		}
		if (score_human == 1) {
			label_winner = "   Human wins!";
			score_human = 0;
			score_win += 1;
			score_total += 1;
		} else if (score_human == 2) {
			label_winner = "   Noone wins!";
			score_human = 0;
		} else {
			label_winner = "   Computer wins!";
			score_total += 1;
		}

		JFrame score_frame = new JFrame("Rock, Scissors, Paper");
		score_frame.getContentPane().setBackground(Color.cyan);
		Container score_panel = score_frame.getContentPane();
		score_panel.setLayout(null);

		JLabel label_result = new JLabel(label_choice + label_winner);
		label_result.setBounds(150, 10, 300, 35);
		score_panel.add(label_result);

		JLabel label_title_human = new JLabel("Human's Choice");
		label_title_human.setBounds(50, 35, 150, 35);
		score_panel.add(label_title_human);

		JLabel label_title_computer = new JLabel("Computer's Choice");
		label_title_computer.setBounds(350, 35, 150, 35);
		score_panel.add(label_title_computer);

		JLabel image_human = new JLabel(
				new ImageIcon(System.getProperty("user.dir") + "/images/" + (choice_human - 1) + ".png"));
		image_human.setBounds(10, 100, 200, 250);
		score_panel.add(image_human);

		JLabel image_computer = new JLabel(
				new ImageIcon(System.getProperty("user.dir") + "/images/" + (choice_computer - 1) + "c.png"));
		image_computer.setBounds(300, 100, 200, 250);
		score_panel.add(image_computer);

		JLabel label_score1 = new JLabel("Win / Total : " + score_win + "/" + score_total);
		label_score1.setBounds(175, 200, 150, 350);
		score_panel.add(label_score1);

		JLabel label_score2 = new JLabel("Tie: " + score_tie);
		label_score2.setBounds(175, 210, 125, 370);
		score_panel.add(label_score2);

		JButton btn_ok = new JButton("OK");
		btn_ok.setBackground(Color.green);
		btn_ok.setBounds(410, 360, 100, 50);
		score_panel.add(btn_ok);

		btn_ok.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				score_frame.dispose();
			}
		});

		score_frame.setSize(600, 450);
		score_frame.setVisible(true);
	}
	//end

}

