import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.CardLayout;
import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;
import java.awt.Window.Type;

public class ShapesCalculater {

//-----------------------Frame------------------------
	
	private JFrame 		ShapeCalculator;
	
//------------------------------------------------------

//-------------------------Panels------------------------
	
	private JPanel 		Main_Menu;
	private JPanel 		Panel_2D;
	private JPanel 		Panel_3D;
	private JPanel 		Circle;
	private JPanel 		Cube;
	private JPanel 		Triangle;
	private JPanel 		Square;
	private JPanel 		Rectangle;
	private JPanel 		Ball;
	private JPanel 		Cuboid;
	private JPanel 		Pyramid;
	
//-----------------------------------------------------

//---------------------Buttons-------------------------
	
	private JButton 	To_Triangle_Panel;
	private JButton 	To_Square_Panel;
	private JButton 	To_Rectangel_Panel;
	private JButton 	Back_To_Main_Menu_From_3D_Panel;
	private JButton 	To_Ball_Panel;
	private JButton 	To_Cube_Panel;
	private JButton 	To_Cuboid_Panel;
	private JButton 	Circle_Calculate_Button;
	private JButton 	Calculate_Cube;
	private JButton 	Calculate_Triangle;
	private JButton 	Back_From_Triangle_to_2D_Panel;
	private JButton 	Calculate_Square;
	private JButton 	Back_From_Square_To_2D_Label;
	private JButton 	Back_From_Rectangle_To_2D_Panel;
	private JButton 	Back_From_Ball_To_3D_Panel;
	private JButton 	Back_From_Cuboid_To_3D_Panel;
	private JButton 	Ball_Calculate;
	private JButton 	Cuboid_Calculate;
	private JButton 	Back_To_Main_Menu_From_2D_Panel;
	private JButton 	To_Pyramid_Panel;
	private JButton 	Back_From_Pyramid_To_3D_Panel;
	private JButton		Rectangle_Calculate;
	private JButton 	Back_from_Circle_Label;
	private JButton 	To_Circle_Panel;
	private JButton 	Button_Of_2D;
	private JButton 	Button_of_3D;
	private JButton 	Back_From_Cube_to_3D_Panel;
	private JButton 	Pyramid_Calculate;
	
//-------------------------------------------------------

//------------------------Labels-------------------------
	
	private JLabel 		Enter_The_Radius_Label;
	private JLabel 		Circle_Text_Declaring;
	private JLabel 		Area_Of_Circle_Lable;
	private JLabel 		Perimeter_Of_Circle_Label;
	private JLabel 		Cube_Shape_Declaring;
	private JLabel 		Enter_The_Length_For_Cube;
	private JLabel 		Area_of_One_Face_text;
	private JLabel 		Volume_text;
	private JLabel 		The_Total_Area_text;
	private JLabel 		Area_Square_Text;
	private JLabel 		Perimeter_Square_Text;
	private JLabel 		Area_Of_Triangle_Text;
	private JLabel 		Perimeter_Triangle_Text;
	private JLabel 		Side_Area_Text;
	private JLabel 		Square_Text;
	private JLabel 		Length_square_Text;
	private JLabel 		Triangle_Text;
	private JLabel 		Length_1_Text_Triangle;
	private JLabel 		Length_2_Text_Triangle;
	private JLabel 		Length_3_Text_Triangel;
	private JLabel 		Ball_Text;
	private JLabel 		Radius_Text;
	private JLabel 		Out_Side_Area_Text;
	private JLabel 		Ball_Volum_Text;
	private JLabel 		Cuboid_Text;
	private JLabel 		Cuboid_Length_Text;
	private JLabel 		Cuboid_Width_Text;
	private JLabel 		Cuboid_High_Text;
	private JLabel 		Cuboid_Total_Area_Text;
	private JLabel 		Cuboid_Volum_Text;
	private JLabel 		Cuboid_Area_of_Medium_Face_Text;
	private JLabel 		Cuboid_Area_of_The_Side_Text;
	private JLabel 		Area_of_Small_Face_Text;
	private JLabel 		Cuboid_Area_of_Big_Face_Text;
	private JLabel 		Pyramid_Text;
	private JLabel 		Enter_The_Length_Rectangle_Text;
	private JLabel 		Enter_The_Width_Rectangle_Text;
	private JLabel 		Area_Rectangle_text;
	private JLabel 		Perimeter_Rectangle_Text;
	private JLabel 		Rectangle_Text;
	private JLabel 		Title_of_Program;
	private JLabel 		Volum_Pyramid_Text;
	private JLabel 		Pyramid_Base_Text;
	private JLabel 		Pyramid_Surface_Area_Text;
	private JLabel 		Pyramid_Length_Text;
	private JLabel 		Pyramid_Width_Text;
	private JLabel 		Pyramid_High_Text;
	
//------------------------------------------------------

//---------------------Text Fields-----------------------
	
	private JTextField 	Taking_Circle_Radius;
	private JTextField 	Area_Of_Circle;
	private JTextField 	Perimeter_Of_Circle;
	private JTextField 	Taking_Cube_Length;
	private JTextField 	Area_of_One_Face;
	private JTextField 	Cube_Volume;
	private JTextField 	Total_Area_of_Cube;
	private JTextField 	Side_Area_Cube;
	private JTextField 	Length_1_Triangle;
	private JTextField 	Length_2_Triangle;
	private JTextField 	Length_3_Triangle;
	private JTextField 	Area_Of_Triangle;
	private JTextField 	Perimeter_Of_Triangle;
	private JTextField 	Taking_Square_length;
	private JTextField 	Area_Of_Square;
	private JTextField 	Perimeter_Square;
	private JTextField 	Rectangle_Length_Input;
	private JTextField 	Rectangle_Width_Input;
	private JTextField 	Area_Rectangle;
	private JTextField 	Rectangle_Perimeter_Output;
	private JTextField 	Radios_Ball_Input;
	private JTextField 	Out_Side_Area_Output;
	private JTextField 	Volum_Output;
	private JTextField 	Cuboid_Length_Input;
	private JTextField 	Cuboid_Width_Input;
	private JTextField 	Cuboid_High_Input;
	private JTextField 	Cuboid_Total_Area_Output;
	private JTextField 	Cuboid_Volum_Output;
	private JTextField 	Cuboid_Area_of_Medium_Face_Input;
	private JTextField 	Cuboid_Area_of_Big_Face_Output;
	private JTextField 	Cuboid_Area_of_Small_Face_Output;
	private JTextField 	Cuboid_Area_of_The_Side_Output;
	private JTextField 	Pyramid_High_Input;
	private JTextField 	Pyramid_Width_Input;
	private JTextField 	Pyramid_Length_Input;
	private JTextField 	Pyramid_Volum_Output;
	private JTextField 	Pyramid_Base_Area_Output;
	private JTextField 	Pyramid_Surface_Area_Output;
	
//-------------------------------------------------------
	
//------------------Shapes Variables---------------------
	
	protected 	double 	Pi = 3.14;
	private 	double 	Radius;
	private 	double 	Length;
	private 	double 	Triangle_L1;
	private 	double 	Triangle_L2;
	private 	double 	Triangle_L3;
	private 	double 	Width;
	private 	double 	High;
	
//---------------------------------------------------------

	/**
	 * Launching the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ShapesCalculater window = new ShapesCalculater();
					window.ShapeCalculator.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
			//--------------Method to round the double numbers----
				
				public double round(double number)
				{
					DecimalFormat df = new DecimalFormat("#.##");
					number = Double.valueOf(df.format(number));
					return number;
				}
	
			//--------------Circle Methods------------------
			
				public double Circle_Perimeter(double radius)
				{
					return round(2  * Pi * radius);
				}
			   
				public double Circle_Area(double radius)
				{
					return round(Pi * radius * radius);
				}
				
			//-------------------------------------------------
			
			//---------------Cube Methods--------------------
				
				public double Cube_Volume(double Length)
				{
					return round(Length * Length * Length);
				}
				
				public double Cube_Total_Area(double Length)
				{
					return round(6 * Length * Length);
				}
				
				public double Cube_Area_of_One_Face(double Length)
				{
					return round(Length * Length);
				}
				
				public double Cube_Side_Area(double Length)
				{
					return round(Length * Length * 4);
				}
				
				//-------------------------------------------------
			
			//-------------Triangle Methods------------------
				
				public double Triangle_Perimeter(double Triangle_L1, double Triangle_L2, double Triangle_L3)
				{
					return round(Triangle_L1 + Triangle_L2 + Triangle_L3);
				}
				
				public double Triangle_Area(double Triangle_L1, double Triangle_L2, double Triangle_L3)
				{
					double Perimeter = (Triangle_L1 + Triangle_L2 + Triangle_L3) / 2;
					return round(Math.sqrt(Perimeter * (Perimeter - Triangle_L1) * (Perimeter - Triangle_L2) * (Perimeter - Triangle_L3)));
				}
				
			//-------------------------------------------------
			
			//----------------Square Methods-----------------
				
				public double Square_Perimeter(double Length)
				{
					return round(4 * Length);
				}

			//-------------------------------------------------
			
			//--------------Rectangle Methods----------------
				
				public double Rectangle_Area(double Length, double Width)
				{
					return round(Length * Width);
				}
				
				public double Rectangle_Perimeter(double Length, double Width)
				{
					return round((Length + Width) * 2);
				}
				
			//-------------------------------------------------
			
			
			//--------------Ball Methods-----------------------
			
				public double Ball_Area(double Radius)
				{
					return round(4 * Pi * Radius * Radius);
				}
				
				public double Ball_Volum(double Radius)
				{
					return round(0.75 * Pi * Radius * Radius * Radius);
				}
			
			//-------------------------------------------------
				
				
			//-----------------Cuboid Methods------------------
				
				public double Area_of_Small_Face(double Length, double Width)
				{
					return round(Length * Width);
				}
				
				public double Area_of_Medium_Face(double Length, double Width)
				{
					return round(Length * Width);
				}
				
				public double Area_of_Larg_Face(double Length, double Width)
				{
					return round(Length * Width);
				}
				
				public double Cuboid_Total_Area(double Length, double Width, double High)
				{
					return round(2 * ((Length * Width) + (Length * High) + (Width * High)));
				}
				
				public double Cuboid_Side_Area(double Length, double Width, double High)
				{
					return round(2 * ((Length * High) + (Width * High)));
				}
				
				public double Cuboid_Volum(double Length, double Width, double High)
				{
					return round(Length * Width * High);
				}
				
			//-------------------------------------------------
				
				
			//------------Right Rectangular Pyramid------------
				
				public double Pyramid_Volum(double Length, double Width, double High)
				{
					return round((Length * Width * High) / 3);
				}
				
				public double Pyramid_Surface_Area(double Length, double Width, double High)
				{
					return round(Length * (Width / 2) * (Width / 2) + 2 * High * High + Width * (Length / 2) * (Length / 2));
				}
				
				public double Pyramid_Base_Area(double Length, double Width)
				{
					return round(Length * Width);
				}
				
			//-------------------------------------------------
				
			
	public ShapesCalculater() {
		initialize();
	}

	private void initialize() {
		
		//----------------The Frame of The Program--------------------------
		
		ShapeCalculator = new JFrame();
		ShapeCalculator.setFont(new Font("Dialog", Font.PLAIN, 15));
		ShapeCalculator.setType(Type.POPUP);
		ShapeCalculator.setTitle("Shape Calculator");
		ShapeCalculator.setBounds(100, 100, 800, 600);
		ShapeCalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ShapeCalculator.getContentPane().setLayout(new CardLayout(0, 0));
		ShapeCalculator.setResizable(false);
		
		//-------------------------------------------------------------------
		
		//----------------------The Main Menu--------------------------------
		
			Main_Menu = new JPanel();
			Main_Menu.setBackground(new Color(40, 44, 52));
			ShapeCalculator.getContentPane().add(Main_Menu);
			Main_Menu.setLayout(null);
			
			Title_of_Program = new JLabel("Please Choose The Shape Type");
			Title_of_Program.setBounds(146, 140, 491, 42);
			Title_of_Program.setHorizontalAlignment(SwingConstants.CENTER);
			Title_of_Program.setForeground(new Color(255, 255, 255));
			Title_of_Program.setFont(new Font("Fugaz One", Font.PLAIN, 28));
			Main_Menu.add(Title_of_Program);
		
		//-------------------------------2D Panel------------------------------------
			
			Panel_2D = new JPanel();
			Panel_2D.setBackground(new Color(40, 44, 52));
			ShapeCalculator.getContentPane().add(Panel_2D);
			Panel_2D.setLayout(null);
		
			
			//---------------------To 2D Panel---------------------------------------
			
				Button_Of_2D = new JButton("2D");
				Button_Of_2D.setHorizontalAlignment(SwingConstants.CENTER);
				Button_Of_2D.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent e)
					{
						Panel_2D.setVisible(true);
						Main_Menu.setVisible(false);
					}
				});
				Button_Of_2D.setForeground(new Color(255, 255, 255));
				Button_Of_2D.setBackground(new Color(46, 77, 109));
				Button_Of_2D.setFont(new Font("Fugaz One", Font.PLAIN, 40));
				Button_Of_2D.setBounds(141, 327, 180, 73);
				Main_Menu.add(Button_Of_2D);
				
			//-----------------------------------------------------------------------
				
		//---------------------------------------------------------------------------	
		
		//-----------------------------3D Panel--------------------------------------
			
			Panel_3D = new JPanel();
			Panel_3D.setBackground(new Color(40, 44, 52));
			ShapeCalculator.getContentPane().add(Panel_3D);
			Panel_3D.setLayout(null);
			
			//------------------------To 3D Panel-----------------------------------
			
				Button_of_3D = new JButton("3D");
				Button_of_3D.setHorizontalAlignment(SwingConstants.CENTER);
				Button_of_3D.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent e)
					{
						Panel_3D.setVisible(true);
						Main_Menu.setVisible(false);
					}
				});
				Button_of_3D.setForeground(new Color(255, 255, 255));
				Button_of_3D.setBackground(new Color(46, 77, 109));
				Button_of_3D.setFont(new Font("Fugaz One", Font.PLAIN, 40));
				Button_of_3D.setBounds(462, 327, 180, 73);
				Main_Menu.add(Button_of_3D);
			
		//--------------------------------------------------------------------------
		
//-----------------------------------------------------2D Shapes-----------------------------------------------------------
		
		//-------------Begining Of Circle Shape------------------------------------
		
			Circle = new JPanel();
			Circle.setBackground(new Color(40, 44, 52));
			ShapeCalculator.getContentPane().add(Circle);
			Circle.setLayout(null);
			
			Taking_Circle_Radius = new JTextField();
			Taking_Circle_Radius.setHorizontalAlignment(SwingConstants.CENTER);
			Taking_Circle_Radius.setFont(new Font("Fugaz One", Font.PLAIN, 25));
			Taking_Circle_Radius.setBounds(308, 172, 160, 50);
			Circle.add(Taking_Circle_Radius);
			
			Enter_The_Radius_Label = new JLabel("Enter The Radius");
			Enter_The_Radius_Label.setForeground(new Color(255, 255, 255));
			Enter_The_Radius_Label.setFont(new Font("Fugaz One", Font.PLAIN, 20));
			Enter_The_Radius_Label.setHorizontalAlignment(SwingConstants.CENTER);
			Enter_The_Radius_Label.setBounds(288, 124, 200, 37);
			Circle.add(Enter_The_Radius_Label);
			
			Circle_Text_Declaring = new JLabel("Circle");
			Circle_Text_Declaring.setForeground(new Color(255, 255, 255));
			Circle_Text_Declaring.setHorizontalAlignment(SwingConstants.CENTER);
			Circle_Text_Declaring.setFont(new Font("Fugaz One", Font.PLAIN, 30));
			Circle_Text_Declaring.setBounds(290, 10, 200, 37);
			Circle.add(Circle_Text_Declaring);
			
			Area_Of_Circle_Lable = new JLabel("Area");
			Area_Of_Circle_Lable.setForeground(new Color(255, 255, 255));
			Area_Of_Circle_Lable.setHorizontalAlignment(SwingConstants.CENTER);
			Area_Of_Circle_Lable.setFont(new Font("Fugaz One", Font.PLAIN, 20));
			Area_Of_Circle_Lable.setBounds(128, 308, 200, 37);
			Circle.add(Area_Of_Circle_Lable);
			
			Perimeter_Of_Circle_Label = new JLabel("Perimeter");
			Perimeter_Of_Circle_Label.setForeground(new Color(255, 255, 255));
			Perimeter_Of_Circle_Label.setHorizontalAlignment(SwingConstants.CENTER);
			Perimeter_Of_Circle_Label.setFont(new Font("Fugaz One", Font.PLAIN, 20));
			Perimeter_Of_Circle_Label.setBounds(456, 308, 200, 37);
			Circle.add(Perimeter_Of_Circle_Label);
			
			Area_Of_Circle = new JTextField();
			Area_Of_Circle.setHorizontalAlignment(SwingConstants.CENTER);
			Area_Of_Circle.setFont(new Font("Fugaz One", Font.PLAIN, 25));
			Area_Of_Circle.setColumns(10);
			Area_Of_Circle.setBounds(148, 368, 160, 50);
			Circle.add(Area_Of_Circle);
			
			Perimeter_Of_Circle = new JTextField();
			Perimeter_Of_Circle.setHorizontalAlignment(SwingConstants.CENTER);
			Perimeter_Of_Circle.setFont(new Font("Fugaz One", Font.PLAIN, 25));
			Perimeter_Of_Circle.setColumns(10);
			Perimeter_Of_Circle.setBounds(476, 368, 160, 50);
			Circle.add(Perimeter_Of_Circle);
		
			//-------------------------------Circle Back Button--------------------------------
				Back_from_Circle_Label = new JButton("Back");
				Back_from_Circle_Label.setForeground(new Color(244, 180, 26));
				Back_from_Circle_Label.setBackground(new Color(20, 61, 89));
				Back_from_Circle_Label.setFont(new Font("Fugaz One", Font.PLAIN, 30));
				Back_from_Circle_Label.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent e)
					{
						Panel_2D.setVisible(true);
						Circle.setVisible(false);
					}
				});
				Back_from_Circle_Label.setBounds(634, 510, 150, 50);
				Circle.add(Back_from_Circle_Label);
				
			//-----------------------------------------------------------------------------------
				
			//----------------------Calculate for Circle-----------------------------------------
				Circle_Calculate_Button = new JButton("Calculate");
				Circle_Calculate_Button.setForeground(new Color(244, 180, 26));
				Circle_Calculate_Button.setBackground(new Color(20, 61, 89));
				Circle_Calculate_Button.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent e)
					{	
						try
						{
							Radius = Double.parseDouble(Taking_Circle_Radius.getText());
							Perimeter_Of_Circle.setText(Double.toString(Circle_Perimeter(Radius)));
							Area_Of_Circle.setText(Double.toString(Circle_Area(Radius)));
						}
						catch(Exception e1)
						{
							JOptionPane.showMessageDialog(null, "Please, Enter a NUMBER!");
						}
					}
				});
				Circle_Calculate_Button.setFont(new Font("Fugaz One", Font.PLAIN, 20));
				Circle_Calculate_Button.setBounds(313, 250, 150, 50);
				Circle.add(Circle_Calculate_Button);
				
			//------------------------------------------------------------------------------------
				
		
		//---------------------------------End Of Circle Shape------------------------------------
		
		//-------------------------------Begin Of Triangle Shape------------------------------------------
				
			Triangle = new JPanel();
			Triangle.setBackground(new Color(40, 44, 52));
			ShapeCalculator.getContentPane().add(Triangle);
			Triangle.setLayout(null);

			Triangle_Text = new JLabel("Triangle");
			Triangle_Text.setHorizontalAlignment(SwingConstants.CENTER);
			Triangle_Text.setForeground(new Color(255, 255, 255));
			Triangle_Text.setFont(new Font("Fugaz One", Font.PLAIN, 30));
			Triangle_Text.setBounds(290, 10, 200, 37);
			Triangle.add(Triangle_Text);
			
			Length_1_Text_Triangle = new JLabel("L1");
			Length_1_Text_Triangle.setHorizontalAlignment(SwingConstants.CENTER);
			Length_1_Text_Triangle.setForeground(new Color(255, 255, 255));
			Length_1_Text_Triangle.setFont(new Font("Fugaz One", Font.PLAIN, 20));
			Length_1_Text_Triangle.setBounds(230, 96, 102, 37);
			Triangle.add(Length_1_Text_Triangle);
			
			Length_2_Text_Triangle = new JLabel("L2");
			Length_2_Text_Triangle.setHorizontalAlignment(SwingConstants.CENTER);
			Length_2_Text_Triangle.setForeground(new Color(255, 255, 255));
			Length_2_Text_Triangle.setFont(new Font("Fugaz One", Font.PLAIN, 20));
			Length_2_Text_Triangle.setBounds(350, 96, 102, 37);
			Triangle.add(Length_2_Text_Triangle);
			
			Length_3_Text_Triangel = new JLabel("L3");
			Length_3_Text_Triangel.setHorizontalAlignment(SwingConstants.CENTER);
			Length_3_Text_Triangel.setForeground(new Color(255, 255, 255));
			Length_3_Text_Triangel.setFont(new Font("Fugaz One", Font.PLAIN, 20));
			Length_3_Text_Triangel.setBounds(450, 96, 102, 37);
			Triangle.add(Length_3_Text_Triangel);
			
			Length_1_Triangle = new JTextField();
			Length_1_Triangle.setHorizontalAlignment(SwingConstants.CENTER);
			Length_1_Triangle.setFont(new Font("Fugaz One", Font.PLAIN, 25));
			Length_1_Triangle.setColumns(10);
			Length_1_Triangle.setBounds(240, 144, 88, 50);
			Triangle.add(Length_1_Triangle);
			
			Length_2_Triangle = new JTextField();
			Length_2_Triangle.setHorizontalAlignment(SwingConstants.CENTER);
			Length_2_Triangle.setFont(new Font("Fugaz One", Font.PLAIN, 25));
			Length_2_Triangle.setColumns(10);
			Length_2_Triangle.setBounds(350, 144, 88, 50);
			Triangle.add(Length_2_Triangle);
			
			Length_3_Triangle = new JTextField();
			Length_3_Triangle.setHorizontalAlignment(SwingConstants.CENTER);
			Length_3_Triangle.setFont(new Font("Fugaz One", Font.PLAIN, 25));
			Length_3_Triangle.setColumns(10);
			Length_3_Triangle.setBounds(460, 144, 88, 50);
			Triangle.add(Length_3_Triangle);
			
			Area_Of_Triangle = new JTextField();
			Area_Of_Triangle.setHorizontalAlignment(SwingConstants.CENTER);
			Area_Of_Triangle.setFont(new Font("Fugaz One", Font.PLAIN, 25));
			Area_Of_Triangle.setColumns(10);
			Area_Of_Triangle.setBounds(148, 394, 160, 50);
			Triangle.add(Area_Of_Triangle);
			
			Area_Of_Triangle_Text = new JLabel("Area");
			Area_Of_Triangle_Text.setHorizontalAlignment(SwingConstants.CENTER);
			Area_Of_Triangle_Text.setForeground(new Color(240, 255, 255));
			Area_Of_Triangle_Text.setFont(new Font("Fugaz One", Font.PLAIN, 20));
			Area_Of_Triangle_Text.setBounds(128, 334, 200, 37);
			Triangle.add(Area_Of_Triangle_Text);
			
			Perimeter_Triangle_Text = new JLabel("Perimeter");
			Perimeter_Triangle_Text.setHorizontalAlignment(SwingConstants.CENTER);
			Perimeter_Triangle_Text.setForeground(new Color(240, 255, 255));
			Perimeter_Triangle_Text.setFont(new Font("Fugaz One", Font.PLAIN, 20));
			Perimeter_Triangle_Text.setBounds(456, 334, 200, 37);
			Triangle.add(Perimeter_Triangle_Text);
			
			Perimeter_Of_Triangle = new JTextField();
			Perimeter_Of_Triangle.setHorizontalAlignment(SwingConstants.CENTER);
			Perimeter_Of_Triangle.setFont(new Font("Fugaz One", Font.PLAIN, 25));
			Perimeter_Of_Triangle.setColumns(10);
			Perimeter_Of_Triangle.setBounds(476, 394, 160, 50);
			Triangle.add(Perimeter_Of_Triangle);
			
			//--------------------------Back Button-------------------------------------------------
		
				Back_From_Triangle_to_2D_Panel = new JButton("Back");
				Back_From_Triangle_to_2D_Panel.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent e)
					{
						Panel_2D.setVisible(true);
						Triangle.setVisible(false);
					}
				});
				Back_From_Triangle_to_2D_Panel.setForeground(new Color(244, 180, 26));
				Back_From_Triangle_to_2D_Panel.setBackground(new Color(20, 61, 89));
				Back_From_Triangle_to_2D_Panel.setFont(new Font("Fugaz One", Font.PLAIN, 30));
				Back_From_Triangle_to_2D_Panel.setBounds(634, 510, 150, 50);
				Triangle.add(Back_From_Triangle_to_2D_Panel);
			
			//---------------------------------------------------------------------------------------------
		
			//--------------------------------------Calculate Button---------------------------------------
		
				Calculate_Triangle = new JButton("Calculate");
				Calculate_Triangle.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent e)
					{
						try
						{
							Triangle_L1 = Double.parseDouble(Length_1_Triangle.getText());
							Triangle_L2 = Double.parseDouble(Length_2_Triangle.getText());
							Triangle_L3 = Double.parseDouble(Length_3_Triangle.getText());
							if((Triangle_L1 + Triangle_L2) > Triangle_L3 && (Triangle_L1 + Triangle_L3) > Triangle_L2 && (Triangle_L2 + Triangle_L3) > Triangle_L1)
							{
					           Area_Of_Triangle.setText(Double.toString(Triangle_Area(Triangle_L1, Triangle_L2, Triangle_L3)));
					           Perimeter_Of_Triangle.setText(Double.toString(Triangle_Perimeter(Triangle_L1, Triangle_L2, Triangle_L3)));     
					        }
					        else
					        {
					        	JOptionPane.showMessageDialog(null, "Area of Triangle Not Exit");
					        }
						}
						catch(Exception e1)
						{
							JOptionPane.showMessageDialog(null, "Please, Enter a NUMBER!");
						}
					}
				});
				Calculate_Triangle.setForeground(new Color(244, 180, 26));
				Calculate_Triangle.setBackground(new Color(20, 61, 89));
				Calculate_Triangle.setFont(new Font("Fugaz One", Font.PLAIN, 20));
				Calculate_Triangle.setBounds(320, 240, 150, 50);
				Triangle.add(Calculate_Triangle);
			
			//---------------------------------------------------------------------------------------------

		//---------------------------------End Of Triangle Shape-----------------------------------------
	
		
		//--------------------------------Begining Of Square Shape------------------------------------------
				
				Square = new JPanel();
		Square.setBackground(new Color(40, 44, 52));
		ShapeCalculator.getContentPane().add(Square);
		Square.setLayout(null);

		Square_Text = new JLabel("Square");
		Square_Text.setHorizontalAlignment(SwingConstants.CENTER);
		Square_Text.setForeground(new Color(255, 255, 255));
		Square_Text.setFont(new Font("Fugaz One", Font.PLAIN, 30));
		Square_Text.setBounds(290, 10, 200, 37);
		Square.add(Square_Text);

		Length_square_Text = new JLabel("Enter The Length");
		Length_square_Text.setHorizontalAlignment(SwingConstants.CENTER);
		Length_square_Text.setForeground(new Color(255, 255, 255));
		Length_square_Text.setFont(new Font("Fugaz One", Font.PLAIN, 20));
		Length_square_Text.setBounds(300, 110, 200, 37);
		Square.add(Length_square_Text);

		Taking_Square_length = new JTextField();
		Taking_Square_length.setHorizontalAlignment(SwingConstants.CENTER);
		Taking_Square_length.setFont(new Font("Fugaz One", Font.PLAIN, 25));
		Taking_Square_length.setColumns(10);
		Taking_Square_length.setBounds(313, 160, 160, 50);
		Square.add(Taking_Square_length);

		Area_Square_Text = new JLabel("Area");
		Area_Square_Text.setHorizontalAlignment(SwingConstants.CENTER);
		Area_Square_Text.setForeground(new Color(240, 255, 255));
		Area_Square_Text.setFont(new Font("Fugaz One", Font.PLAIN, 20));
		Area_Square_Text.setBounds(128, 326, 200, 37);
		Square.add(Area_Square_Text);

		Area_Of_Square = new JTextField();
		Area_Of_Square.setHorizontalAlignment(SwingConstants.CENTER);
		Area_Of_Square.setFont(new Font("Fugaz One", Font.PLAIN, 25));
		Area_Of_Square.setColumns(10);
		Area_Of_Square.setBounds(148, 386, 160, 50);
		Square.add(Area_Of_Square);

		Perimeter_Square = new JTextField();
		Perimeter_Square.setHorizontalAlignment(SwingConstants.CENTER);
		Perimeter_Square.setFont(new Font("Fugaz One", Font.PLAIN, 25));
		Perimeter_Square.setColumns(10);
		Perimeter_Square.setBounds(476, 386, 160, 50);
		Square.add(Perimeter_Square);

		Perimeter_Square_Text = new JLabel("Perimeter");
		Perimeter_Square_Text.setHorizontalAlignment(SwingConstants.CENTER);
		Perimeter_Square_Text.setForeground(new Color(240, 255, 255));
		Perimeter_Square_Text.setFont(new Font("Fugaz One", Font.PLAIN, 20));
		Perimeter_Square_Text.setBounds(456, 326, 200, 37);
		Square.add(Perimeter_Square_Text);

		// ------------------------Calculate Square Button-----------------------------

		Calculate_Square = new JButton("Calculate");
		Calculate_Square.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Length = Double.parseDouble(Taking_Square_length.getText());
					Area_Of_Square.setText(Double.toString(Cube_Area_of_One_Face(Length)));
					Perimeter_Square.setText(Double.toString(Square_Perimeter(Length)));
				} catch (Exception e1) {
					JOptionPane.showMessageDialog(null, "Please, Enter a NUMBER!");
				}
			}
		});
		Calculate_Square.setForeground(new Color(244, 180, 26));
		Calculate_Square.setBackground(new Color(20, 61, 89));
		Calculate_Square.setFont(new Font("Fugaz One", Font.PLAIN, 20));
		Calculate_Square.setBounds(320, 240, 150, 50);
		Square.add(Calculate_Square);

		// --------------------------------------------------------------------------

		// ------------------------Back Square Button--------------------------------

		Back_From_Square_To_2D_Label = new JButton("Back");
		Back_From_Square_To_2D_Label.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Panel_2D.setVisible(true);
				Square.setVisible(false);
			}
		});
		Back_From_Square_To_2D_Label.setForeground(new Color(244, 180, 26));
		Back_From_Square_To_2D_Label.setBackground(new Color(20, 61, 89));
		Back_From_Square_To_2D_Label.setFont(new Font("Fugaz One", Font.PLAIN, 30));
		Back_From_Square_To_2D_Label.setBounds(634, 510, 150, 50);
		Square.add(Back_From_Square_To_2D_Label);
				
		//--------------------------------------------------------------------------
				
		//-------------------------------End Of Square Shape---------------------------------------------
		
		//------------------------------Begin Of Rectangle Shape-----------------------------------------
					
					Rectangle = new JPanel();
		Rectangle.setBackground(new Color(40, 44, 52));
		ShapeCalculator.getContentPane().add(Rectangle);
		Rectangle.setLayout(null);

		Enter_The_Length_Rectangle_Text = new JLabel("Enter The Length");
		Enter_The_Length_Rectangle_Text.setHorizontalAlignment(SwingConstants.CENTER);
		Enter_The_Length_Rectangle_Text.setForeground(new Color(255, 255, 255));
		Enter_The_Length_Rectangle_Text.setFont(new Font("Fugaz One", Font.PLAIN, 20));
		Enter_The_Length_Rectangle_Text.setBounds(150, 124, 200, 37);
		Rectangle.add(Enter_The_Length_Rectangle_Text);

		Rectangle_Length_Input = new JTextField();
		Rectangle_Length_Input.setHorizontalAlignment(SwingConstants.CENTER);
		Rectangle_Length_Input.setFont(new Font("Fugaz One", Font.PLAIN, 25));
		Rectangle_Length_Input.setColumns(10);
		Rectangle_Length_Input.setBounds(170, 170, 160, 50);
		Rectangle.add(Rectangle_Length_Input);

		Enter_The_Width_Rectangle_Text = new JLabel("Enter The Width");
		Enter_The_Width_Rectangle_Text.setHorizontalAlignment(SwingConstants.CENTER);
		Enter_The_Width_Rectangle_Text.setForeground(new Color(255, 255, 255));
		Enter_The_Width_Rectangle_Text.setFont(new Font("Fugaz One", Font.PLAIN, 20));
		Enter_The_Width_Rectangle_Text.setBounds(445, 124, 200, 37);
		Rectangle.add(Enter_The_Width_Rectangle_Text);

		Rectangle_Width_Input = new JTextField();
		Rectangle_Width_Input.setHorizontalAlignment(SwingConstants.CENTER);
		Rectangle_Width_Input.setFont(new Font("Fugaz One", Font.PLAIN, 25));
		Rectangle_Width_Input.setColumns(10);
		Rectangle_Width_Input.setBounds(465, 172, 160, 50);
		Rectangle.add(Rectangle_Width_Input);

		Rectangle_Text = new JLabel("Rectangle");
		Rectangle_Text.setHorizontalAlignment(SwingConstants.CENTER);
		Rectangle_Text.setForeground(new Color(240, 255, 255));
		Rectangle_Text.setFont(new Font("Fugaz One", Font.PLAIN, 30));
		Rectangle_Text.setBounds(290, 10, 200, 37);
		Rectangle.add(Rectangle_Text);

		Area_Rectangle = new JTextField();
		Area_Rectangle.setHorizontalAlignment(SwingConstants.CENTER);
		Area_Rectangle.setFont(new Font("Fugaz One", Font.PLAIN, 25));
		Area_Rectangle.setColumns(10);
		Area_Rectangle.setBounds(170, 391, 160, 50);
		Rectangle.add(Area_Rectangle);

		Area_Rectangle_text = new JLabel("Area");
		Area_Rectangle_text.setHorizontalAlignment(SwingConstants.CENTER);
		Area_Rectangle_text.setForeground(new Color(240, 255, 255));
		Area_Rectangle_text.setFont(new Font("Fugaz One", Font.PLAIN, 20));
		Area_Rectangle_text.setBounds(150, 343, 200, 37);
		Rectangle.add(Area_Rectangle_text);

		Rectangle_Perimeter_Output = new JTextField();
		Rectangle_Perimeter_Output.setHorizontalAlignment(SwingConstants.CENTER);
		Rectangle_Perimeter_Output.setFont(new Font("Fugaz One", Font.PLAIN, 25));
		Rectangle_Perimeter_Output.setColumns(10);
		Rectangle_Perimeter_Output.setBounds(470, 391, 160, 50);
		Rectangle.add(Rectangle_Perimeter_Output);

		Perimeter_Rectangle_Text = new JLabel("Perimeter");
		Perimeter_Rectangle_Text.setHorizontalAlignment(SwingConstants.CENTER);
		Perimeter_Rectangle_Text.setForeground(new Color(240, 255, 255));
		Perimeter_Rectangle_Text.setFont(new Font("Fugaz One", Font.PLAIN, 20));
		Perimeter_Rectangle_Text.setBounds(450, 343, 200, 37);
		Rectangle.add(Perimeter_Rectangle_Text);

		// ---------------------------Calculate Button----------------------------------------

		Rectangle_Calculate = new JButton("Calculate");
		Rectangle_Calculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				try {
					Length = Double.parseDouble(Rectangle_Length_Input.getText());
					Width = Double.parseDouble(Rectangle_Width_Input.getText());
					Area_Rectangle.setText(Double.toString(Rectangle_Area(Length, Width)));
					Rectangle_Perimeter_Output.setText(Double.toString(Rectangle_Perimeter(Length, Width)));
				} catch (Exception e1) {
					JOptionPane.showMessageDialog(null, "Please, Enter a NUMBER!");
				}
			}
		});
		Rectangle_Calculate.setForeground(new Color(244, 180, 26));
		Rectangle_Calculate.setBackground(new Color(20, 61, 89));
		Rectangle_Calculate.setFont(new Font("Fugaz One", Font.PLAIN, 20));
		Rectangle_Calculate.setBounds(323, 270, 150, 50);
		Rectangle.add(Rectangle_Calculate);
		// ----------------------------------------------------------------------------------

		// ---------------------------Back Button---------------------------------------------

		Back_From_Rectangle_To_2D_Panel = new JButton("Back");
		Back_From_Rectangle_To_2D_Panel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Panel_2D.setVisible(true);
				Rectangle.setVisible(false);
			}
		});
		Back_From_Rectangle_To_2D_Panel.setForeground(new Color(244, 180, 26));
		Back_From_Rectangle_To_2D_Panel.setBackground(new Color(20, 61, 89));
		Back_From_Rectangle_To_2D_Panel.setFont(new Font("Fugaz One", Font.PLAIN, 30));
		Back_From_Rectangle_To_2D_Panel.setBounds(634, 510, 150, 50);
		Rectangle.add(Back_From_Rectangle_To_2D_Panel);
			//-----------------------------------------------------------------------------------
						
		//------------------------------End Of Rectangle Shape-------------------------------------------
		
//----------------------------------------------End Of 2D Shapes------------------------------------------------------

					
					
//--------------------------------------------Begin Of 3D Shapes------------------------------------------------------
					
	//------------------------------------Begin of Ball Shape-------------------------------------
					
	Ball = new JPanel();
	Ball.setBackground(new Color(40, 44, 52));
	ShapeCalculator.getContentPane().add(Ball);
	Ball.setLayout(null);

	Ball_Text = new JLabel("Ball");
	Ball_Text.setHorizontalAlignment(SwingConstants.CENTER);
	Ball_Text.setForeground(new Color(255, 255, 255));
	Ball_Text.setFont(new Font("Fugaz One", Font.PLAIN, 30));
	Ball_Text.setBounds(290, 10, 200, 37);
	Ball.add(Ball_Text);

	Radius_Text = new JLabel("Enter The Radius");
	Radius_Text.setHorizontalAlignment(SwingConstants.CENTER);
	Radius_Text.setForeground(new Color(255, 255, 255));
	Radius_Text.setFont(new Font("Fugaz One", Font.PLAIN, 20));
	Radius_Text.setBounds(290, 130, 200, 37);
	Ball.add(Radius_Text);

	Radios_Ball_Input = new JTextField();
	Radios_Ball_Input.setHorizontalAlignment(SwingConstants.CENTER);
	Radios_Ball_Input.setFont(new Font("Fugaz One", Font.PLAIN, 25));
	Radios_Ball_Input.setColumns(10);
	Radios_Ball_Input.setBounds(310, 190, 160, 50);
	Ball.add(Radios_Ball_Input);

	Out_Side_Area_Output = new JTextField();
	Out_Side_Area_Output.setHorizontalAlignment(SwingConstants.CENTER);
	Out_Side_Area_Output.setFont(new Font("Fugaz One", Font.PLAIN, 25));
	Out_Side_Area_Output.setColumns(10);
	Out_Side_Area_Output.setBounds(148, 385, 160, 50);
	Ball.add(Out_Side_Area_Output);

	Out_Side_Area_Text = new JLabel("Out Side Area");
	Out_Side_Area_Text.setHorizontalAlignment(SwingConstants.CENTER);
	Out_Side_Area_Text.setForeground(new Color(240, 255, 255));
	Out_Side_Area_Text.setFont(new Font("Fugaz One", Font.PLAIN, 20));
	Out_Side_Area_Text.setBounds(128, 325, 200, 37);
	Ball.add(Out_Side_Area_Text);

	Ball_Volum_Text = new JLabel("Volume");
	Ball_Volum_Text.setHorizontalAlignment(SwingConstants.CENTER);
	Ball_Volum_Text.setForeground(new Color(240, 255, 255));
	Ball_Volum_Text.setFont(new Font("Fugaz One", Font.PLAIN, 20));
	Ball_Volum_Text.setBounds(456, 325, 200, 37);
	Ball.add(Ball_Volum_Text);

	Volum_Output = new JTextField();
	Volum_Output.setHorizontalAlignment(SwingConstants.CENTER);
	Volum_Output.setFont(new Font("Fugaz One", Font.PLAIN, 25));
	Volum_Output.setColumns(10);
	Volum_Output.setBounds(476, 385, 160, 50);
	Ball.add(Volum_Output);

	// ------------------------------------Calculate
	// Button------------------------------------

	Ball_Calculate = new JButton("Calculate");
	Ball_Calculate.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			try {
				Radius = Double.parseDouble(Radios_Ball_Input.getText());
				Out_Side_Area_Output.setText(Double.toString(Ball_Area(Radius)));
				Volum_Output.setText(Double.toString(Ball_Volum(Radius)));
			} catch (Exception e1) {
				JOptionPane.showMessageDialog(null, "Please, Enter a NUMBER!");
			}
		}
	});
	Ball_Calculate.setForeground(new Color(244, 180, 26));
	Ball_Calculate.setBackground(new Color(20, 61, 89));
	Ball_Calculate.setFont(new Font("Fugaz One", Font.PLAIN, 20));
	Ball_Calculate.setBounds(315, 260, 150, 50);
	Ball.add(Ball_Calculate);

	// ----------------------------------------------------------------------------------------

	// --------------------------------------Back
	// Button---------------------------------------

	Back_From_Ball_To_3D_Panel = new JButton("Back");
	Back_From_Ball_To_3D_Panel.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			Panel_3D.setVisible(true);
			Ball.setVisible(false);
		}
	});
	Back_From_Ball_To_3D_Panel.setForeground(new Color(244, 180, 26));
	Back_From_Ball_To_3D_Panel.setBackground(new Color(20, 61, 89));
	Back_From_Ball_To_3D_Panel.setFont(new Font("Fugaz One", Font.PLAIN, 30));
	Back_From_Ball_To_3D_Panel.setBounds(634, 510, 150, 50);
	Ball.add(Back_From_Ball_To_3D_Panel);

	// ----------------------------------------------------------------------------------------

	// -------------------------------------End Of Ball Shape--------------------------------------

	// ------------------------------------Begin Of Cube Shape-------------------------------------

	Cube = new JPanel();
	Cube.setBackground(new Color(40, 44, 52));
	ShapeCalculator.getContentPane().add(Cube);
	Cube.setLayout(null);

	Cube_Shape_Declaring = new JLabel("Cube");
	Cube_Shape_Declaring.setHorizontalAlignment(SwingConstants.CENTER);
	Cube_Shape_Declaring.setForeground(new Color(255, 255, 255));
	Cube_Shape_Declaring.setFont(new Font("Fugaz One", Font.PLAIN, 30));
	Cube_Shape_Declaring.setBounds(300, 10, 200, 37);
	Cube.add(Cube_Shape_Declaring);

	Taking_Cube_Length = new JTextField();
	Taking_Cube_Length.setHorizontalAlignment(SwingConstants.CENTER);
	Taking_Cube_Length.setFont(new Font("Fugaz One", Font.PLAIN, 25));
	Taking_Cube_Length.setColumns(10);
	Taking_Cube_Length.setBounds(320, 123, 160, 50);
	Cube.add(Taking_Cube_Length);

	Enter_The_Length_For_Cube = new JLabel("Enter The Length");
	Enter_The_Length_For_Cube.setHorizontalAlignment(SwingConstants.CENTER);
	Enter_The_Length_For_Cube.setForeground(new Color(255, 255, 255));
	Enter_The_Length_For_Cube.setFont(new Font("Fugaz One", Font.PLAIN, 20));
	Enter_The_Length_For_Cube.setBounds(300, 75, 200, 37);
	Cube.add(Enter_The_Length_For_Cube);

	Area_of_One_Face_text = new JLabel("Area of One Face");
	Area_of_One_Face_text.setHorizontalAlignment(SwingConstants.CENTER);
	Area_of_One_Face_text.setForeground(new Color(255, 255, 255));
	Area_of_One_Face_text.setFont(new Font("Fugaz One", Font.PLAIN, 20));
	Area_of_One_Face_text.setBounds(56, 297, 200, 37);
	Cube.add(Area_of_One_Face_text);

	Volume_text = new JLabel("Volume");
	Volume_text.setHorizontalAlignment(SwingConstants.CENTER);
	Volume_text.setForeground(new Color(255, 255, 255));
	Volume_text.setFont(new Font("Fugaz One", Font.PLAIN, 20));
	Volume_text.setBounds(292, 297, 200, 37);
	Cube.add(Volume_text);

	The_Total_Area_text = new JLabel("The Total Area");
	The_Total_Area_text.setHorizontalAlignment(SwingConstants.CENTER);
	The_Total_Area_text.setForeground(new Color(255, 255, 255));
	The_Total_Area_text.setFont(new Font("Fugaz One", Font.PLAIN, 20));
	The_Total_Area_text.setBounds(528, 297, 200, 37);
	Cube.add(The_Total_Area_text);

	Area_of_One_Face = new JTextField();
	Area_of_One_Face.setHorizontalAlignment(SwingConstants.CENTER);
	Area_of_One_Face.setFont(new Font("Fugaz One", Font.PLAIN, 25));
	Area_of_One_Face.setColumns(10);
	Area_of_One_Face.setBounds(76, 357, 160, 50);
	Cube.add(Area_of_One_Face);

	Cube_Volume = new JTextField();
	Cube_Volume.setHorizontalAlignment(SwingConstants.CENTER);
	Cube_Volume.setFont(new Font("Fugaz One", Font.PLAIN, 25));
	Cube_Volume.setColumns(10);
	Cube_Volume.setBounds(312, 357, 160, 50);
	Cube.add(Cube_Volume);

	Total_Area_of_Cube = new JTextField();
	Total_Area_of_Cube.setHorizontalAlignment(SwingConstants.CENTER);
	Total_Area_of_Cube.setFont(new Font("Fugaz One", Font.PLAIN, 25));
	Total_Area_of_Cube.setColumns(10);
	Total_Area_of_Cube.setBounds(548, 357, 160, 50);
	Cube.add(Total_Area_of_Cube);

	Side_Area_Text = new JLabel("Side Area");
	Side_Area_Text.setHorizontalAlignment(SwingConstants.CENTER);
	Side_Area_Text.setForeground(new Color(255, 255, 255));
	Side_Area_Text.setFont(new Font("Fugaz One", Font.PLAIN, 20));
	Side_Area_Text.setBounds(292, 421, 200, 37);
	Cube.add(Side_Area_Text);

	Side_Area_Cube = new JTextField();
	Side_Area_Cube.setHorizontalAlignment(SwingConstants.CENTER);
	Side_Area_Cube.setFont(new Font("Fugaz One", Font.PLAIN, 25));
	Side_Area_Cube.setColumns(10);
	Side_Area_Cube.setBounds(312, 481, 160, 50);
	Cube.add(Side_Area_Cube);

	// ------------------------------------Calculate Button------------------------------------

	Calculate_Cube = new JButton("Calculate");
	Calculate_Cube.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			try {

				Length = Double.parseDouble(Taking_Cube_Length.getText());
				Area_of_One_Face.setText(Double.toString(Cube_Area_of_One_Face(Length)));
				Cube_Volume.setText(Double.toString(Cube_Volume(Length)));
				Total_Area_of_Cube.setText(Double.toString(Cube_Total_Area(Length)));
				Side_Area_Cube.setText(Double.toString(Cube_Side_Area(Length)));
			} catch (Exception e1) {
				JOptionPane.showMessageDialog(null, "Please, Enter a NUMBER!");
			}
		}
	});
	Calculate_Cube.setForeground(new Color(244, 180, 26));
	Calculate_Cube.setBackground(new Color(20, 61, 89));
	Calculate_Cube.setFont(new Font("Fugaz One", Font.PLAIN, 20));
	Calculate_Cube.setBounds(325, 201, 150, 50);
	Cube.add(Calculate_Cube);

	// ----------------------------------------------------------------------------------------

	// --------------------------------------Back Button---------------------------------------

	Back_From_Cube_to_3D_Panel = new JButton("Back");
	Back_From_Cube_to_3D_Panel.setForeground(new Color(244, 180, 26));
	Back_From_Cube_to_3D_Panel.setBackground(new Color(20, 61, 89));
	Back_From_Cube_to_3D_Panel.setFont(new Font("Fugaz One", Font.PLAIN, 30));
	Back_From_Cube_to_3D_Panel.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			Panel_3D.setVisible(true);
			Cube.setVisible(false);
		}
	});
	Back_From_Cube_to_3D_Panel.setBounds(634, 510, 150, 50);
	Cube.add(Back_From_Cube_to_3D_Panel);
		
		//----------------------------------------------------------------------------------------
					
	//-------------------------------------End Of Cube Shape--------------------------------------
	
	//------------------------------------Begin Of Cuboid Shape-----------------------------------
					
		Cuboid = new JPanel();
		Cuboid.setBackground(new Color(40, 44, 52));
		ShapeCalculator.getContentPane().add(Cuboid);
		Cuboid.setLayout(null);

		Cuboid_Text = new JLabel("Cuboid");
		Cuboid_Text.setHorizontalAlignment(SwingConstants.CENTER);
		Cuboid_Text.setForeground(new Color(255, 255, 255));
		Cuboid_Text.setFont(new Font("Fugaz One", Font.PLAIN, 30));
		Cuboid_Text.setBounds(290, 10, 200, 37);
		Cuboid.add(Cuboid_Text);

		Cuboid_Length_Text = new JLabel("Length");
		Cuboid_Length_Text.setHorizontalAlignment(SwingConstants.CENTER);
		Cuboid_Length_Text.setForeground(new Color(255, 255, 255));
		Cuboid_Length_Text.setFont(new Font("Fugaz One", Font.PLAIN, 20));
		Cuboid_Length_Text.setBounds(230, 74, 102, 37);
		Cuboid.add(Cuboid_Length_Text);

		Cuboid_Width_Text = new JLabel("Width");
		Cuboid_Width_Text.setHorizontalAlignment(SwingConstants.CENTER);
		Cuboid_Width_Text.setForeground(new Color(255, 255, 255));
		Cuboid_Width_Text.setFont(new Font("Fugaz One", Font.PLAIN, 20));
		Cuboid_Width_Text.setBounds(342, 74, 102, 37);
		Cuboid.add(Cuboid_Width_Text);

		Cuboid_High_Text = new JLabel("Hight");
		Cuboid_High_Text.setHorizontalAlignment(SwingConstants.CENTER);
		Cuboid_High_Text.setForeground(new Color(255, 255, 255));
		Cuboid_High_Text.setFont(new Font("Fugaz One", Font.PLAIN, 20));
		Cuboid_High_Text.setBounds(454, 74, 102, 37);
		Cuboid.add(Cuboid_High_Text);

		Cuboid_Length_Input = new JTextField();
		Cuboid_Length_Input.setHorizontalAlignment(SwingConstants.CENTER);
		Cuboid_Length_Input.setFont(new Font("Fugaz One", Font.PLAIN, 25));
		Cuboid_Length_Input.setColumns(10);
		Cuboid_Length_Input.setBounds(237, 122, 88, 50);
		Cuboid.add(Cuboid_Length_Input);

		Cuboid_Width_Input = new JTextField();
		Cuboid_Width_Input.setHorizontalAlignment(SwingConstants.CENTER);
		Cuboid_Width_Input.setFont(new Font("Fugaz One", Font.PLAIN, 25));
		Cuboid_Width_Input.setColumns(10);
		Cuboid_Width_Input.setBounds(349, 122, 88, 50);
		Cuboid.add(Cuboid_Width_Input);

		Cuboid_High_Input = new JTextField();
		Cuboid_High_Input.setHorizontalAlignment(SwingConstants.CENTER);
		Cuboid_High_Input.setFont(new Font("Fugaz One", Font.PLAIN, 25));
		Cuboid_High_Input.setColumns(10);
		Cuboid_High_Input.setBounds(461, 122, 88, 50);
		Cuboid.add(Cuboid_High_Input);

		Cuboid_Total_Area_Output = new JTextField();
		Cuboid_Total_Area_Output.setHorizontalAlignment(SwingConstants.CENTER);
		Cuboid_Total_Area_Output.setFont(new Font("Fugaz One", Font.PLAIN, 25));
		Cuboid_Total_Area_Output.setColumns(10);
		Cuboid_Total_Area_Output.setBounds(76, 427, 160, 50);
		Cuboid.add(Cuboid_Total_Area_Output);

		Cuboid_Total_Area_Text = new JLabel("Total Area");
		Cuboid_Total_Area_Text.setHorizontalAlignment(SwingConstants.CENTER);
		Cuboid_Total_Area_Text.setForeground(new Color(255, 255, 255));
		Cuboid_Total_Area_Text.setFont(new Font("Fugaz One", Font.PLAIN, 20));
		Cuboid_Total_Area_Text.setBounds(56, 392, 200, 37);
		Cuboid.add(Cuboid_Total_Area_Text);

		Cuboid_Volum_Text = new JLabel("Volume");
		Cuboid_Volum_Text.setHorizontalAlignment(SwingConstants.CENTER);
		Cuboid_Volum_Text.setForeground(new Color(255, 255, 255));
		Cuboid_Volum_Text.setFont(new Font("Fugaz One", Font.PLAIN, 20));
		Cuboid_Volum_Text.setBounds(528, 392, 200, 37);
		Cuboid.add(Cuboid_Volum_Text);

		Cuboid_Volum_Output = new JTextField();
		Cuboid_Volum_Output.setHorizontalAlignment(SwingConstants.CENTER);
		Cuboid_Volum_Output.setFont(new Font("Fugaz One", Font.PLAIN, 25));
		Cuboid_Volum_Output.setColumns(10);
		Cuboid_Volum_Output.setBounds(548, 427, 160, 50);
		Cuboid.add(Cuboid_Volum_Output);

		Cuboid_Area_of_Medium_Face_Input = new JTextField();
		Cuboid_Area_of_Medium_Face_Input.setHorizontalAlignment(SwingConstants.CENTER);
		Cuboid_Area_of_Medium_Face_Input.setFont(new Font("Fugaz One", Font.PLAIN, 25));
		Cuboid_Area_of_Medium_Face_Input.setColumns(10);
		Cuboid_Area_of_Medium_Face_Input.setBounds(312, 318, 160, 50);
		Cuboid.add(Cuboid_Area_of_Medium_Face_Input);

		Cuboid_Area_of_Medium_Face_Text = new JLabel("Area of Medium Face\r\n");
		Cuboid_Area_of_Medium_Face_Text.setHorizontalAlignment(SwingConstants.CENTER);
		Cuboid_Area_of_Medium_Face_Text.setForeground(new Color(255, 255, 255));
		Cuboid_Area_of_Medium_Face_Text.setFont(new Font("Fugaz One", Font.PLAIN, 20));
		Cuboid_Area_of_Medium_Face_Text.setBounds(285, 285, 215, 37);
		Cuboid.add(Cuboid_Area_of_Medium_Face_Text);

		Cuboid_Area_of_Big_Face_Output = new JTextField();
		Cuboid_Area_of_Big_Face_Output.setHorizontalAlignment(SwingConstants.CENTER);
		Cuboid_Area_of_Big_Face_Output.setFont(new Font("Fugaz One", Font.PLAIN, 25));
		Cuboid_Area_of_Big_Face_Output.setColumns(10);
		Cuboid_Area_of_Big_Face_Output.setBounds(548, 318, 160, 50);
		Cuboid.add(Cuboid_Area_of_Big_Face_Output);

		Cuboid_Area_of_Small_Face_Output = new JTextField();
		Cuboid_Area_of_Small_Face_Output.setHorizontalAlignment(SwingConstants.CENTER);
		Cuboid_Area_of_Small_Face_Output.setFont(new Font("Fugaz One", Font.PLAIN, 25));
		Cuboid_Area_of_Small_Face_Output.setColumns(10);
		Cuboid_Area_of_Small_Face_Output.setBounds(76, 318, 160, 50);
		Cuboid.add(Cuboid_Area_of_Small_Face_Output);

		Area_of_Small_Face_Text = new JLabel("Area of Small Face");
		Area_of_Small_Face_Text.setHorizontalAlignment(SwingConstants.CENTER);
		Area_of_Small_Face_Text.setForeground(new Color(255, 255, 255));
		Area_of_Small_Face_Text.setFont(new Font("Fugaz One", Font.PLAIN, 20));
		Area_of_Small_Face_Text.setBounds(56, 285, 200, 37);
		Cuboid.add(Area_of_Small_Face_Text);

		Cuboid_Area_of_Big_Face_Text = new JLabel("Area of Big Face\r\n");
		Cuboid_Area_of_Big_Face_Text.setHorizontalAlignment(SwingConstants.CENTER);
		Cuboid_Area_of_Big_Face_Text.setForeground(new Color(255, 255, 255));
		Cuboid_Area_of_Big_Face_Text.setFont(new Font("Fugaz One", Font.PLAIN, 20));
		Cuboid_Area_of_Big_Face_Text.setBounds(528, 285, 200, 37);
		Cuboid.add(Cuboid_Area_of_Big_Face_Text);

		Cuboid_Area_of_The_Side_Output = new JTextField();
		Cuboid_Area_of_The_Side_Output.setHorizontalAlignment(SwingConstants.CENTER);
		Cuboid_Area_of_The_Side_Output.setFont(new Font("Fugaz One", Font.PLAIN, 25));
		Cuboid_Area_of_The_Side_Output.setColumns(10);
		Cuboid_Area_of_The_Side_Output.setBounds(312, 425, 160, 50);
		Cuboid.add(Cuboid_Area_of_The_Side_Output);

		Cuboid_Area_of_The_Side_Text = new JLabel("Area of The Side");
		Cuboid_Area_of_The_Side_Text.setHorizontalAlignment(SwingConstants.CENTER);
		Cuboid_Area_of_The_Side_Text.setForeground(new Color(255, 255, 255));
		Cuboid_Area_of_The_Side_Text.setFont(new Font("Fugaz One", Font.PLAIN, 20));
		Cuboid_Area_of_The_Side_Text.setBounds(292, 392, 200, 37);
		Cuboid.add(Cuboid_Area_of_The_Side_Text);

		// ------------------------------------Calculate Button------------------------------------

		Cuboid_Calculate = new JButton("Calculate");
		Cuboid_Calculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Length = Double.parseDouble(Cuboid_Length_Input.getText());
					Width = Double.parseDouble(Cuboid_Width_Input.getText());
					High = Double.parseDouble(Cuboid_High_Input.getText());
					if ((Length * Width) < (Length * High) && (Length * Width) < (Width * High)) {
						Cuboid_Area_of_Small_Face_Output.setText(Double.toString(Area_of_Small_Face(Length, Width)));

						if ((Length * High) < (Width * High)) {
							Cuboid_Area_of_Medium_Face_Input
									.setText(Double.toString(Area_of_Medium_Face(Length, High)));
							Cuboid_Area_of_Big_Face_Output.setText(Double.toString(Area_of_Larg_Face(Width, High)));
						}

						else {
							Cuboid_Area_of_Medium_Face_Input.setText(Double.toString(Area_of_Medium_Face(Width, High)));
							Cuboid_Area_of_Big_Face_Output.setText(Double.toString(Area_of_Larg_Face(Length, High)));
						}

					} else if ((Length * High) < (Length * Width) && (Length * High) < (Width * High)) {
						Cuboid_Area_of_Small_Face_Output.setText(Double.toString(Area_of_Small_Face(Length, High)));

						if ((Length * Width) < (Width * High)) {
							Cuboid_Area_of_Medium_Face_Input
									.setText(Double.toString(Area_of_Medium_Face(Length, Width)));
							Cuboid_Area_of_Big_Face_Output.setText(Double.toString(Area_of_Larg_Face(Width, High)));
						}

						else {
							Cuboid_Area_of_Medium_Face_Input.setText(Double.toString(Area_of_Medium_Face(Width, High)));
							Cuboid_Area_of_Big_Face_Output.setText(Double.toString(Area_of_Larg_Face(Length, Width)));
						}

					} else if ((Width * High) < (Length * Width) && (Width * High) < (Length * High)) {
						Cuboid_Area_of_Small_Face_Output.setText(Double.toString(Area_of_Small_Face(Width, High)));

						if ((Length * Width) < (Length * High)) {
							Cuboid_Area_of_Medium_Face_Input
									.setText(Double.toString(Area_of_Medium_Face(Length, Width)));
							Cuboid_Area_of_Big_Face_Output.setText(Double.toString(Area_of_Larg_Face(Length, High)));
						}

						else {
							Cuboid_Area_of_Medium_Face_Input
									.setText(Double.toString(Area_of_Medium_Face(Length, High)));
							Cuboid_Area_of_Big_Face_Output.setText(Double.toString(Area_of_Larg_Face(Length, Width)));
						}

					}
					Cuboid_Total_Area_Output.setText(Double.toString(Cuboid_Total_Area(Length, Width, High)));
					Cuboid_Area_of_The_Side_Output.setText(Double.toString(Cuboid_Side_Area(Length, Width, High)));
					Cuboid_Volum_Output.setText(Double.toString(Cuboid_Volum(Length, Width, High)));
				} catch (Exception e1) {
					JOptionPane.showMessageDialog(null, "Please, Enter a NUMBER!");
				}
			}
		});
		Cuboid_Calculate.setForeground(new Color(244, 180, 26));
		Cuboid_Calculate.setBackground(new Color(20, 61, 89));
		Cuboid_Calculate.setFont(new Font("Fugaz One", Font.PLAIN, 20));
		Cuboid_Calculate.setBounds(318, 217, 150, 50);
		Cuboid.add(Cuboid_Calculate);

		// ----------------------------------------------------------------------------------------

		// --------------------------------------Back Button---------------------------------------

		Back_From_Cuboid_To_3D_Panel = new JButton("Back");
		Back_From_Cuboid_To_3D_Panel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Panel_3D.setVisible(true);
				Cuboid.setVisible(false);
			}
		});
		Back_From_Cuboid_To_3D_Panel.setForeground(new Color(244, 180, 26));
		Back_From_Cuboid_To_3D_Panel.setBackground(new Color(20, 61, 89));
		Back_From_Cuboid_To_3D_Panel.setFont(new Font("Fugaz One", Font.PLAIN, 30));
		Back_From_Cuboid_To_3D_Panel.setBounds(634, 510, 150, 50);
		Cuboid.add(Back_From_Cuboid_To_3D_Panel);
			
		
		//----------------------------------------------------------------------------------------
					
	//-------------------------------------End Of Cuboid Shape------------------------------------
					
	//------------------------------------Begin Of Pyramid Shape----------------------------------
					
		Pyramid = new JPanel();
		Pyramid.setBackground(new Color(40, 44, 52));
		ShapeCalculator.getContentPane().add(Pyramid);
		Pyramid.setLayout(null);

		Pyramid_Text = new JLabel("Pyramid");
		Pyramid_Text.setHorizontalAlignment(SwingConstants.CENTER);
		Pyramid_Text.setForeground(new Color(255, 255, 255));
		Pyramid_Text.setFont(new Font("Fugaz One", Font.PLAIN, 30));
		Pyramid_Text.setBounds(290, 10, 200, 37);
		Pyramid.add(Pyramid_Text);

		Pyramid_Length_Text = new JLabel("Length");
		Pyramid_Length_Text.setHorizontalAlignment(SwingConstants.CENTER);
		Pyramid_Length_Text.setForeground(new Color(255, 255, 255));
		Pyramid_Length_Text.setFont(new Font("Fugaz One", Font.PLAIN, 20));
		Pyramid_Length_Text.setBounds(221, 121, 102, 37);
		Pyramid.add(Pyramid_Length_Text);

		Pyramid_Width_Text = new JLabel("Width");
		Pyramid_Width_Text.setHorizontalAlignment(SwingConstants.CENTER);
		Pyramid_Width_Text.setForeground(new Color(255, 255, 255));
		Pyramid_Width_Text.setFont(new Font("Fugaz One", Font.PLAIN, 20));
		Pyramid_Width_Text.setBounds(333, 121, 102, 37);
		Pyramid.add(Pyramid_Width_Text);

		Pyramid_High_Text = new JLabel("Hight");
		Pyramid_High_Text.setHorizontalAlignment(SwingConstants.CENTER);
		Pyramid_High_Text.setForeground(new Color(255, 255, 255));
		Pyramid_High_Text.setFont(new Font("Fugaz One", Font.PLAIN, 20));
		Pyramid_High_Text.setBounds(445, 121, 102, 37);
		Pyramid.add(Pyramid_High_Text);

		Pyramid_Length_Input = new JTextField();
		Pyramid_Length_Input.setHorizontalAlignment(SwingConstants.CENTER);
		Pyramid_Length_Input.setFont(new Font("Fugaz One", Font.PLAIN, 25));
		Pyramid_Length_Input.setColumns(10);
		Pyramid_Length_Input.setBounds(228, 169, 88, 50);
		Pyramid.add(Pyramid_Length_Input);

		Pyramid_Width_Input = new JTextField();
		Pyramid_Width_Input.setHorizontalAlignment(SwingConstants.CENTER);
		Pyramid_Width_Input.setFont(new Font("Fugaz One", Font.PLAIN, 25));
		Pyramid_Width_Input.setColumns(10);
		Pyramid_Width_Input.setBounds(340, 169, 88, 50);
		Pyramid.add(Pyramid_Width_Input);

		Pyramid_High_Input = new JTextField();
		Pyramid_High_Input.setHorizontalAlignment(SwingConstants.CENTER);
		Pyramid_High_Input.setFont(new Font("Fugaz One", Font.PLAIN, 25));
		Pyramid_High_Input.setColumns(10);
		Pyramid_High_Input.setBounds(452, 169, 88, 50);
		Pyramid.add(Pyramid_High_Input);

		Pyramid_Volum_Output = new JTextField();
		Pyramid_Volum_Output.setHorizontalAlignment(SwingConstants.CENTER);
		Pyramid_Volum_Output.setFont(new Font("Fugaz One", Font.PLAIN, 25));
		Pyramid_Volum_Output.setColumns(10);
		Pyramid_Volum_Output.setBounds(128, 404, 150, 50);
		Pyramid.add(Pyramid_Volum_Output);

		Volum_Pyramid_Text = new JLabel("Volume");
		Volum_Pyramid_Text.setHorizontalAlignment(SwingConstants.CENTER);
		Volum_Pyramid_Text.setForeground(new Color(255, 255, 255));
		Volum_Pyramid_Text.setFont(new Font("Fugaz One", Font.PLAIN, 20));
		Volum_Pyramid_Text.setBounds(128, 342, 150, 37);
		Pyramid.add(Volum_Pyramid_Text);

		Pyramid_Base_Text = new JLabel("Base Area");
		Pyramid_Base_Text.setHorizontalAlignment(SwingConstants.CENTER);
		Pyramid_Base_Text.setForeground(new Color(255, 255, 255));
		Pyramid_Base_Text.setFont(new Font("Fugaz One", Font.PLAIN, 20));
		Pyramid_Base_Text.setBounds(310, 342, 150, 37);
		Pyramid.add(Pyramid_Base_Text);

		Pyramid_Base_Area_Output = new JTextField();
		Pyramid_Base_Area_Output.setHorizontalAlignment(SwingConstants.CENTER);
		Pyramid_Base_Area_Output.setFont(new Font("Fugaz One", Font.PLAIN, 25));
		Pyramid_Base_Area_Output.setColumns(10);
		Pyramid_Base_Area_Output.setBounds(310, 404, 150, 50);
		Pyramid.add(Pyramid_Base_Area_Output);

		Pyramid_Surface_Area_Text = new JLabel("Surface Area");
		Pyramid_Surface_Area_Text.setHorizontalAlignment(SwingConstants.CENTER);
		Pyramid_Surface_Area_Text.setForeground(new Color(255, 255, 255));
		Pyramid_Surface_Area_Text.setFont(new Font("Fugaz One", Font.PLAIN, 20));
		Pyramid_Surface_Area_Text.setBounds(492, 342, 150, 37);
		Pyramid.add(Pyramid_Surface_Area_Text);

		Pyramid_Surface_Area_Output = new JTextField();
		Pyramid_Surface_Area_Output.setHorizontalAlignment(SwingConstants.CENTER);
		Pyramid_Surface_Area_Output.setFont(new Font("Fugaz One", Font.PLAIN, 25));
		Pyramid_Surface_Area_Output.setColumns(10);
		Pyramid_Surface_Area_Output.setBounds(492, 404, 150, 50);
		Pyramid.add(Pyramid_Surface_Area_Output);

		// ------------------------------------Calculate
		// Button------------------------------------

		Pyramid_Calculate = new JButton("Calculate");
		Pyramid_Calculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Length = Double.parseDouble(Pyramid_Length_Input.getText());
					Width = Double.parseDouble(Pyramid_Width_Input.getText());
					High = Double.parseDouble(Pyramid_High_Input.getText());
					Pyramid_Volum_Output.setText(Double.toString(Pyramid_Volum(Length, Width, High)));
					Pyramid_Base_Area_Output.setText(Double.toString(Pyramid_Base_Area(Length, Width)));
					Pyramid_Surface_Area_Output.setText(Double.toString(Pyramid_Surface_Area(Length, Width, High)));
				} catch (Exception e1) {
					JOptionPane.showMessageDialog(null, "Please, Enter a NUMBER!");
				}
			}
		});
		Pyramid_Calculate.setForeground(new Color(244, 180, 26));
		Pyramid_Calculate.setBackground(new Color(20, 61, 89));
		Pyramid_Calculate.setFont(new Font("Fugaz One", Font.PLAIN, 20));
		Pyramid_Calculate.setBounds(310, 264, 150, 50);
		Pyramid.add(Pyramid_Calculate);

		// ----------------------------------------------------------------------------------------

		// --------------------------------------Back
		// Button---------------------------------------

		Back_From_Pyramid_To_3D_Panel = new JButton("Back");
		Back_From_Pyramid_To_3D_Panel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Panel_3D.setVisible(true);
				Pyramid.setVisible(false);
			}
		});
		Back_From_Pyramid_To_3D_Panel.setForeground(new Color(244, 180, 26));
		Back_From_Pyramid_To_3D_Panel.setBackground(new Color(20, 61, 89));
		Back_From_Pyramid_To_3D_Panel.setFont(new Font("Fugaz One", Font.PLAIN, 30));
		Back_From_Pyramid_To_3D_Panel.setBounds(634, 510, 150, 50);
		Pyramid.add(Back_From_Pyramid_To_3D_Panel);
		
		//----------------------------------------------------------------------------------------
					
	//-------------------------------------End Of Pyramid Shape-----------------------------------
									
//---------------------------------------------End Of 3D Shapes-------------------------------------------------------
		
		
//--------------------------------------------------------2D Panel Buttons--------------------------------------------------------
		
		Back_To_Main_Menu_From_2D_Panel = new JButton("Back To Main Menu");
		Back_To_Main_Menu_From_2D_Panel.setForeground(new Color(244, 180, 26));
		Back_To_Main_Menu_From_2D_Panel.setBackground(new Color(20, 61, 89));
		Back_To_Main_Menu_From_2D_Panel.setFont(new Font("Fugaz One", Font.PLAIN, 20));
		Back_To_Main_Menu_From_2D_Panel.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				Panel_2D.setVisible(false);
				Main_Menu.setVisible(true);
			}
		});
		Back_To_Main_Menu_From_2D_Panel.setBounds(505, 510, 279, 50);
		Panel_2D.add(Back_To_Main_Menu_From_2D_Panel);
		
		
		To_Circle_Panel = new JButton("Circle");
		To_Circle_Panel.setHorizontalAlignment(SwingConstants.CENTER);
		To_Circle_Panel.setForeground(new Color(244, 180, 26));
		To_Circle_Panel.setBackground(new Color(20, 61, 89));
		To_Circle_Panel.setFont(new Font("Fugaz One", Font.PLAIN, 20));
		To_Circle_Panel.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				Panel_2D.setVisible(false);
				Circle.setVisible(true);
			}
		});
		To_Circle_Panel.setBounds(60, 120, 200, 80);
		Panel_2D.add(To_Circle_Panel);
		

		To_Triangle_Panel = new JButton("Triangle");
		To_Triangle_Panel.setHorizontalAlignment(SwingConstants.CENTER);
		To_Triangle_Panel.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				Triangle.setVisible(true);
				Panel_2D.setVisible(false);
			}
		});
		To_Triangle_Panel.setForeground(new Color(244, 180, 26));
		To_Triangle_Panel.setFont(new Font("Fugaz One", Font.PLAIN, 20));
		To_Triangle_Panel.setBackground(new Color(20, 61, 89));
		To_Triangle_Panel.setBounds(510, 120, 200, 80);
		Panel_2D.add(To_Triangle_Panel);
		

		To_Square_Panel = new JButton("Square");
		To_Square_Panel.setHorizontalAlignment(SwingConstants.CENTER);
		To_Square_Panel.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				Square.setVisible(true);
				Panel_2D.setVisible(false);
			}
		});
		To_Square_Panel.setForeground(new Color(244, 180, 26));
		To_Square_Panel.setFont(new Font("Fugaz One", Font.PLAIN, 20));
		To_Square_Panel.setBackground(new Color(20, 61, 89));
		To_Square_Panel.setBounds(510, 390, 200, 80);
		Panel_2D.add(To_Square_Panel);
		

		To_Rectangel_Panel = new JButton("Rectangle");
		To_Rectangel_Panel.setHorizontalAlignment(SwingConstants.CENTER);
		To_Rectangel_Panel.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				Rectangle.setVisible(true);
				Panel_2D.setVisible(false);
			}
		});
		To_Rectangel_Panel.setForeground(new Color(244, 180, 26));
		To_Rectangel_Panel.setFont(new Font("Fugaz One", Font.PLAIN, 20));
		To_Rectangel_Panel.setBackground(new Color(20, 61, 89));
		To_Rectangel_Panel.setBounds(60, 390, 200, 80);
		Panel_2D.add(To_Rectangel_Panel);

//---------------------------------------------------------------------------------------------------------

//-----------------------------------------------3D Panel Buttons------------------------------------------

		Back_To_Main_Menu_From_3D_Panel = new JButton("Back To Main Menu");
		Back_To_Main_Menu_From_3D_Panel.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				Panel_3D.setVisible(false);
				Main_Menu.setVisible(true);
			}
		});
		Back_To_Main_Menu_From_3D_Panel.setForeground(new Color(244, 180, 26));
		Back_To_Main_Menu_From_3D_Panel.setFont(new Font("Fugaz One", Font.PLAIN, 20));
		Back_To_Main_Menu_From_3D_Panel.setBackground(new Color(20, 61, 89));
		Back_To_Main_Menu_From_3D_Panel.setBounds(505, 510, 279, 50);
		Panel_3D.add(Back_To_Main_Menu_From_3D_Panel);

		
		To_Ball_Panel = new JButton("Ball");
		To_Ball_Panel.setHorizontalAlignment(SwingConstants.CENTER);
		To_Ball_Panel.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				Ball.setVisible(true);
				Panel_3D.setVisible(false);
			}
		});
		To_Ball_Panel.setForeground(new Color(244, 180, 26));
		To_Ball_Panel.setFont(new Font("Fugaz One", Font.PLAIN, 20));
		To_Ball_Panel.setBackground(new Color(20, 61, 89));
		To_Ball_Panel.setBounds(60, 120, 200, 80);
		Panel_3D.add(To_Ball_Panel);
		

		To_Cube_Panel = new JButton("Cube");
		To_Cube_Panel.setHorizontalAlignment(SwingConstants.CENTER);
		To_Cube_Panel.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				Cube.setVisible(true);
				Panel_3D.setVisible(false);
			}
		});
		To_Cube_Panel.setForeground(new Color(244, 180, 26));
		To_Cube_Panel.setFont(new Font("Fugaz One", Font.PLAIN, 20));
		To_Cube_Panel.setBackground(new Color(20, 61, 89));
		To_Cube_Panel.setBounds(510, 390, 200, 80);
		Panel_3D.add(To_Cube_Panel);
		

		To_Cuboid_Panel = new JButton("Cuboid");
		To_Cuboid_Panel.setHorizontalAlignment(SwingConstants.CENTER);
		To_Cuboid_Panel.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				Cuboid.setVisible(true);
				Panel_3D.setVisible(false);
			}
		});
		To_Cuboid_Panel.setForeground(new Color(244, 180, 26));
		To_Cuboid_Panel.setFont(new Font("Fugaz One", Font.PLAIN, 20));
		To_Cuboid_Panel.setBackground(new Color(20, 61, 89));
		To_Cuboid_Panel.setBounds(60, 390, 200, 80);
		Panel_3D.add(To_Cuboid_Panel);
		
		
		To_Pyramid_Panel = new JButton("Pyramid");
		To_Pyramid_Panel.setHorizontalAlignment(SwingConstants.CENTER);
		To_Pyramid_Panel.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				Pyramid.setVisible(true);
				Panel_3D.setVisible(false);
			}
		});
		To_Pyramid_Panel.setForeground(new Color(244, 180, 26));
		To_Pyramid_Panel.setFont(new Font("Fugaz One", Font.PLAIN, 20));
		To_Pyramid_Panel.setBackground(new Color(20, 61, 89));
		To_Pyramid_Panel.setBounds(510, 120, 200, 80);
		Panel_3D.add(To_Pyramid_Panel);
	}
}