import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*; 

public class Game extends JFrame implements ActionListener,MouseListener{
	static Random dice = new Random();
	static Game fir= new Game();
	static JPanel cent = new JPanel();
	static JPanel west = new JPanel();
	static JPanel north = new JPanel();
	static JPanel paper = new JPanel();
	static JPanel soup = new JPanel();
	static JPanel potp = new JPanel();
	static JPanel start= new JPanel();
	static JPanel end= new JPanel();
	static JButton exit = new JButton();
	static JButton pa = new JButton();
	static JButton so = new JButton();	
	static JButton wr = new JButton();
	static JButton nr = new JButton();
	static JButton pot = new JButton();
	static JButton fork = new JButton();
	static JButton silver = new JButton();
	static JButton see = new JButton();
	static JButton che = new JButton();
	static JButton dri = new JButton();
	static JButton med = new JButton();
	static JButton book = new JButton();
	static JButton open = new JButton();
	static JButton newgame = new JButton();
	static JButton[] srol = new JButton[10];
	static JButton[] drol = new JButton[10];
	static JLabel check = new JLabel();
	static ImageIcon [] imgs = new ImageIcon[100];
	static ImageIcon bg1 = new ImageIcon();
	static ImageIcon bg2 = new ImageIcon();
	static ImageIcon bg3 = new ImageIcon();
	static ImageIcon role = new ImageIcon();
    static JLabel background = new JLabel();
    static JLabel lab = new JLabel();
    static JLabel labp = new JLabel();
    static JLabel labs = new JLabel();
    static JLabel labb = new JLabel();
    static JLabel labpo = new JLabel();
    static JLabel sanline = new JLabel();
    static JLabel sanvalue = new JLabel();
    static JLabel sandemage = new JLabel();
    static JLabel startmenu = new JLabel();
    static JLabel endmenu = new JLabel();
    static boolean rolp = true;
    static boolean rolpo = true;
    static boolean rols = true;
    static boolean prol = true;
    static boolean potopen = false;
    static boolean blood = false;
    static boolean poison = false;
    static boolean poisondrink = false;
    static boolean bookfind = false;
    static boolean soupdri = false;

    static int san;
    public boolean sancheck(){
    	int value = dice.nextInt(100);
		sanvalue.setText(value+"/"+san);
    	if(value < san){
    		return true;
    	}
    	else{
    		return false;
    	}
    }
	//設定背景
	public void setBg(ImageIcon img){
	    ((JPanel)this.getContentPane()).setOpaque(false);  
		this.getLayeredPane().add(background, new Integer(Integer.MIN_VALUE));
		background.setBounds(0, 0, img.getIconWidth(), img.getIconHeight());
		}
	//畫面切換
	public void change(JPanel jp,ImageIcon img){
		exit.setVisible(true);
	    jp.add(exit);
//	    jp.add(up);
		jp.setLayout(null);
		jp.setVisible(true);
		jp.setOpaque(false);
		cent.setVisible(false);
	    fir.add(jp);
	    background.setIcon(img);
	}
	public static void setting(JButton bt){
		bt.addMouseListener(fir);
		bt.addActionListener(fir);
		bt.setBorderPainted(false);
		bt.setContentAreaFilled(false);
	}
	//設定
	public static void set(){
		//設定按鈕
		nr.setBounds(390,140,125,140);
		so.setBounds(425,325,30,30);
		pa.setBounds(460,350,20,20);
		wr.setBounds(150,230,140,170);

		see.setBounds(200, 600, 60, 50);
		pot.setBounds(420, 120, 80, 100);
		fork.setBounds(10, 200, 150, 100);
		exit.setBounds(20, 460, 120, 50);
		che.setBounds(250, 600, 100, 50);
		dri.setBounds(600, 600, 100, 50);
		lab.setBounds(0,0,1024,724);
		labp.setBounds(0,0,1024,724);
		labpo.setBounds(0,0,1024,724);
		labs.setBounds(0,0,1024,724);
		labb.setBounds(0,0,1024,724);
		startmenu.setBounds(0,0,1024,724);
		sanline.setBounds(20,0,200,50);
		sanvalue.setBounds(420,360,120,50);
		sandemage.setBounds(420,360,120,50);
		cent.setBounds(0,0,1024,724);
		west.setBounds(0,0,1024,724);
		north.setBounds(0,0,1024,724);
		paper.setBounds(0,0,1024,724);
		start.setBounds(0,0,1024,724);
		soup.setBounds(0,0,1024,724);
		potp.setBounds(0,0,1024,724);
		med.setBounds(330, 560, 60, 50);
		book.setBounds(330, 420, 10, 60);
		open.setBounds(415, 640, 100, 50);
		silver.setBounds(750, 10, 233, 36);
		newgame.setBounds(315,480,395,120);
		for(int i=0;i<10;i++){
			srol[i].setBounds(440,300,50,50);
			srol[i].addMouseListener(fir);
			srol[i].addActionListener(fir);
			srol[i].setVisible(false);
		}
		for(int i=0;i<10;i++){
			drol[i].setBounds(440,300,50,50);
			drol[i].addMouseListener(fir);
			drol[i].addActionListener(fir);
			drol[i].setVisible(false);
		}
		setting(nr);
		setting(so);
		setting(pa);
		setting(wr);

		setting(che);
		setting(dri);
		setting(pot);
		setting(fork);
		setting(see);
		setting(exit);
		setting(med);
		setting(book);
		setting(open);
		setting(silver);
		setting(newgame);
		//lab
		lab.setVisible(false);
		labp.setVisible(false);
		labpo.setVisible(false);
		labs.setVisible(false);
		labb.setVisible(false);
		sanvalue.setVisible(false);
		sandemage.setVisible(false);
		silver.setVisible(false);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//設定圖片
		bg1 = new ImageIcon("background.jpg");
		bg2 = new ImageIcon("end.jpg");
		bg3 = new ImageIcon("gameover.jpg");
		role = new ImageIcon("rol.png");
		startmenu.setIcon(bg1);
		fir.add(newgame);
		san = 80;
		for(int i=0;i<8;i++){
			imgs[i]=new ImageIcon("room/img"+(i+1)+".jpg");
		}
		for(int i=8;i<36;i++){
			imgs[i]=new ImageIcon("img/img"+(i-7)+".png");
		}
		for(int i=0;i<10;i++){
			srol[i] = new JButton();
			fir.add(srol[i]);
			srol[i].setIcon(role);
		}
		for(int i=0;i<10;i++){
			drol[i] = new JButton();
			fir.add(drol[i]);
			drol[i].setIcon(role);
		}
		fir.setTitle("Call of Cthulhu");
		fir.setLayout(null);
		fir.setSize(1024, 744);
		fir.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fir.add(start);
		start.add(startmenu);
		fir.add(sanline);
		fir.add(sanvalue);
		fir.add(sandemage);
		fir.add(silver);
		fir.add(lab);
		fir.add(cent);	
		set();
		//設定cent面板
		cent.setOpaque(false);
		cent.setLayout(null);
		cent.setVisible(false);
		cent.add(wr);
		cent.add(nr);
		cent.add(pa);
		cent.add(so);
		start.setOpaque(false);
		start.setLayout(null);
		Font font = new Font(Font.DIALOG_INPUT,Font.BOLD,35);
		sanline.setForeground(Color.white);
		sanvalue.setForeground(Color.white);
		sandemage.setForeground(Color.white);
		sanline.setFont(font);
		sanvalue.setFont(font);
		sandemage.setFont(font);
		sanline.setText("SAN:"+san+"/80");
		sanvalue.setText("??/"+san);
		cent.setVisible(true);
		background.setIcon(imgs[0]);
		fir.setBg(imgs[0]);
		fir.setVisible(true);	
	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		JButton btn = (JButton)e.getSource();
		btn.setBorderPainted(true);
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		JButton btn = (JButton)e.getSource();
		btn.setBorderPainted(false);
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton btn = (JButton)e.getSource();
		//gameover
		if(san==0){
			west.setVisible(false);
			north.setVisible(false);
			paper.setVisible(false);
			soup.setVisible(false);
			cent.setVisible(false);
			exit.setVisible(false);
			sanline.setVisible(false);
			background.setIcon(bg3);
		}
		//開始遊戲
		if(btn==newgame){
			cent.setVisible(true);
			newgame.setVisible(false);
			start.setVisible(false);
		}
		//書房
		if(btn==wr){
			west.add(book);
			change(west,imgs[4]);
			lab.setIcon(imgs[31]);
			lab.setVisible(true);
			book.setVisible(true);
		  }
		//廚房
		else if(btn==nr){
			north.add(pot);
			north.add(fork);
			lab.setIcon(imgs[30]);
			lab.setVisible(true);
			change(north,imgs[1]);
			}
		//紙條
		else if(btn==pa){
			if(rolp){
			paper.add(see);
			}
			paper.add(labp);
			change(paper,imgs[6]);
			labp.setIcon(imgs[8]);
			labp.setVisible(true);
			}
		//湯
		else if(btn==so){
			change(soup,imgs[5]);
			soup.add(che);
			soup.add(dri);
			soup.add(med);
			soup.add(labs);
			che.setVisible(true);
			dri.setVisible(true);
			med.setVisible(false);
			labs.setIcon(imgs[15]);
			labs.setVisible(true);
			soupdri = true; 
			}
		//識破判定
		if(btn==see){
			int find = dice.nextInt(100);
			rolp = false;
			if(find<50){
				labp.setIcon(imgs[9]);
				srol[0].setVisible(true);
				sanvalue.setVisible(true);
				sanvalue.setText("??/"+san);
				blood = true;
			}
			else{
				labp.setIcon(imgs[12]);
			}
			see.setVisible(false);
		}
		//調查湯
		if(btn==che&&rols){
			labs.setIcon(imgs[19]);
			che.setVisible(false);
			dri.setVisible(false);
			med.setVisible(true);
			soupdri = false;
		}
		//喝湯
		if(btn==dri){
			//遊戲結束
			if(poisondrink){
				west.setVisible(false);
				north.setVisible(false);
				paper.setVisible(false);
				soup.setVisible(false);
				cent.setVisible(false);
				exit.setVisible(false);
				sanline.setVisible(false);
				background.setIcon(bg2);
			}
			soupdri = false;
			che.setVisible(false);
			dri.setVisible(false);
			exit.setVisible(false);
			if(!poisondrink&&blood){
				labs.setIcon(imgs[24]);
				srol[3].setVisible(true);
				sanvalue.setVisible(true);
				sanvalue.setText("??/"+san);
			}
			else if(!poisondrink&&!blood){
				labs.setIcon(imgs[25]);
				srol[4].setVisible(true);
				sanvalue.setText("??/"+san);
				sanvalue.setVisible(true);
			}
		}
		//醫學判定
		if(btn==med){
			int medic = dice.nextInt(100);
			if(medic<60){
				labs.setIcon(imgs[20]);
				srol[2].setVisible(true);
				sanvalue.setText("??/"+san);
				sanvalue.setVisible(true);
				med.setVisible(false);
				exit.setVisible(false);
				rols = false;
				blood = true;
			}			
		}
		//鍋子
		if(btn==pot){
			change(potp,imgs[7]);
			potp.add(labpo);
			labpo.setIcon(imgs[16]);
			north.setVisible(false);
			potopen=true;
			labpo.setVisible(true);
			lab.setVisible(false);
			blood=true;
			if(rolpo){
			srol[1].setVisible(true);
			sanvalue.setText("??/"+san);
			sanvalue.setVisible(true);
			exit.setVisible(false);
			rolpo=false;
			}
		}
		//餐具
		if(btn==fork){
			silver.setVisible(true);
			silver.setIcon(imgs[34]);
		}
		if(btn==silver){
			if(bookfind){
				silver.setIcon(imgs[35]);
				poison = true;
			}
			if(poison&&soupdri){
				change(soup,imgs[3]);
				silver.setVisible(false);
				poisondrink = true;
			}
		}
		//書
		if(btn==book){
			labb.setIcon(imgs[32]);
			labb.setVisible(true);
			lab.setVisible(false);
			book.setVisible(false);
			open.setVisible(true);
			west.add(labb);
			west.add(open);
			bookfind = true;
		}
		//翻開書
		if(btn==open){
			labb.setIcon(imgs[33]);
			open.setVisible(false);
			bookfind = false;
		}
		//紙條理智判定
		if(btn==srol[0]){
			srol[0].setVisible(false);
			   if(sancheck()){
				   labp.setIcon(imgs[10]);
			   }
			   else{
				   labp.setIcon(imgs[11]);
					drol[0].setVisible(true);
			   }    	    
		}
		//鍋子理智判定
		if(btn==srol[1]){
			srol[1].setVisible(false);
			   if(sancheck()){
					labpo.setIcon(imgs[17]);
					san-= 1;
					sanline.setText("SAN:"+san+"/80");
					exit.setVisible(true);	
			   }
			   else{
				   labpo.setIcon(imgs[18]);
				   drol[1].setVisible(true);
			   }    	    
		}
		//醫學理智判定
		if(btn==srol[2]){
			srol[2].setVisible(false);
			   if(sancheck()){
					labs.setIcon(imgs[22]);
					san-= 1;
					sanline.setText("SAN:"+san+"/80");
					exit.setVisible(true);	
			   }
			   else{
				   labs.setIcon(imgs[23]);
				   drol[2].setVisible(true);
			   }    	    
		}
		//喝湯知情理智判定
		if(btn==srol[3]){
			srol[3].setVisible(false);
			   if(sancheck()){
					labs.setIcon(imgs[26]);
					san-= 1;
					sanline.setText("SAN:"+san+"/80");
					exit.setVisible(true);	
			   }
			   else{
				   labs.setIcon(imgs[27]);
				   drol[3].setVisible(true);
			   }    	    
		}
		//喝湯不知情理智判定
		if(btn==srol[4]){
			srol[4].setVisible(false);
			   if(sancheck()){
					labs.setIcon(imgs[28]);
					 drol[4].setVisible(true);
			   }
			   else{
				   labs.setIcon(imgs[29]);
				   drol[5].setVisible(true);
			   }    	    
		}
		//紙條傷害判定
		if(btn==drol[0]){
			drol[0].setVisible(false);
			sandemage.setVisible(true);
			sanvalue.setVisible(false);
			int demage = dice.nextInt(4);
			sandemage.setText("SAN-"+demage);
			san-=demage;
			sanline.setText("SAN:"+san+"/80");
		}
		//鍋子傷害判定
		if(btn==drol[1]){
			drol[1].setVisible(false);
			sandemage.setVisible(true);
			sanvalue.setVisible(false);
			int demage = dice.nextInt(6)+1;
			sandemage.setText("SAN-"+demage);
			san-=demage;
			sanline.setText("SAN:"+san+"/80");
			exit.setVisible(true);
		}
		//醫學傷害判定
		if(btn==drol[2]){
			drol[2].setVisible(false);
			sandemage.setVisible(true);
			sanvalue.setVisible(false);
			int demage = dice.nextInt(4)+1;
			sandemage.setText("SAN-"+demage);
			san-=demage;
			sanline.setText("SAN:"+san+"/80");
			exit.setVisible(true);
		}
		//喝湯知情傷害判定
		if(btn==drol[3]){
			drol[3].setVisible(false);
			sandemage.setVisible(true);
			sanvalue.setVisible(false);
			int demage = dice.nextInt(6)+1;
			sandemage.setText("SAN-"+demage);
			san-=demage;
			sanline.setText("SAN:"+san+"/80");
			exit.setVisible(true);
		}
		//喝湯不知情成功傷害判定
		if(btn==drol[4]){
			drol[4].setVisible(false);
			sandemage.setVisible(true);
			sanvalue.setVisible(false);
			int demage = dice.nextInt(3);
			sandemage.setText("SAN-"+demage);
			san-=demage;
			sanline.setText("SAN:"+san+"/80");
			exit.setVisible(true);
		}
		//喝湯不知情失敗傷害判定
		if(btn==drol[5]){
			drol[5].setVisible(false);
			sandemage.setVisible(true);
			sanvalue.setVisible(false);
			int demage = dice.nextInt(3);
			sandemage.setText("SAN-"+demage);
			san-=demage;
			sanline.setText("SAN:"+san+"/80");
			exit.setVisible(true);
		}
		//離開
		if(btn==exit){
			sanvalue.setVisible(false);
			sandemage.setVisible(false);
			if(potopen){
				change(north,imgs[1]);
				potp.setVisible(false);
				potopen = false;
				lab.setVisible(true);
			}
			else{
				west.setVisible(false);
				north.setVisible(false);
				paper.setVisible(false);
				soup.setVisible(false);
				cent.setVisible(true);
				exit.setVisible(false);
				lab.setVisible(false);
				background.setIcon(imgs[0]);
				labb.setVisible(false);
				bookfind = false;
			}
		} 
	}
}
