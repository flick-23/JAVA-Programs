import java.io.*;
import java.lang.*;
class Shop
{
	protected static void main(String[]args) throws IOException
	{
	
		InputStreamReader read=new InputStreamReader(System.in);
		BufferedReader venki=new BufferedReader(read);
	
		System.out.println("\n***************WELCOME TO VENKY'S SMART MART***************");
	
		do										//to repeat the whole program to enable the customer to buy multiple items 
		{
			int tot_sta=0,tot_it=0;			
			int choice_sta,choice_it,choice_eat,choice_men,choice_women;
			int choice_gen,shop_sta,shop_it;
			int pencil_quantity,eraser_quantity,sharpner_quantity,cardsheet_quantity,colourpaper_quantity,paper_quantity,ruledpapers_quantity,book_quantity,crapen_quantity,paints_quantity,geometery_quantity,glue_quantity,tape_quantity,ruler_quantity,cover_quantity;
			int tot_pen=0,tot_er=0,tot_sh=0,tot_cd=0,tot_col=0,tot_pa=0,tot_rp=0,tot_crp=0,tot_pai=0,tot_geo=0,tot_gl=0,tot_tap=0,tot_rul=0,tot_cov=0;
			int tot_pencil=0,tot_eraser=0,tot_sharpner=0,tot_cardsheet=0,tot_colourpapers=0,tot_paper=0,tot_ruledpapers=0,tot_book=0,tot_crayonpen=0,tot_pain=0,tot_geom=0,tot_glue=0,tot_tape=0,tot_rulers=0,tot_cover=0,tot_other_sta=0;
			int processor_quantity,graphic_quantity,motherboard_quantity,mouse_quantity,keyboard_quantity,speaker_quantity,headphone_quantity,earphone_quantity,ups_quantity,pen_quantity,sdcard_quantity,camera_quantity,cd_quantity,dvd_quantity,anti_quantity;
			int tot_proce=0,tot_gra=0,tot_moth=0,tot_mou=0,tot_key=0,tot_spea,tot_head,tot_ear=0,tot_up=0,tot_pend=0,tot_sd=0,tot_cam=0,tot_CD=0,tot_Dvd=0,tot_anti=0;
			int tot_processor=0,tot_graphics=0,tot_motherboard=0,tot_mouse=0,tot_keyboard=0,tot_speaker=0,tot_headphone=0,tot_earphone=0,tot_ups=0,tot_pendrive=0,tot_sdcard=0,tot_camera=0,tot_cd=0,tot_dvd=0,tot_antivirus=0;
			int pen_company_choice,sd_company_choice,camera_company,cold_lit,juice_lit,dairy_company_choice,curd_lit,flavouredmilk_company_choice,flavour_lit;
			int vegetables_quantity,fruit_quantity,coldrinks_quantity,juice_quantity,milk_quantity,flavoured_quantity,flavoured_quantity,dry_fruits_quantity,dry_quantity,
			int tot_veg=0,tot_fru=0,tot_cold=0,tot_jui=0,tot_mil=0,tot_cur=0,tot_flavour=0,tot_dry=0
			int tot_vegetables=0,tot_fruits=0,tot_coldrink=0,tot_juice=0,tot_milk=0,tot_curd=0,tot_flavoured_milk=0,tot_dry_fruits=0
	
			System.out.println("\n Choose one of the Sub Items to continue your shopping\n1.Stationary Items\n2.IT Items\n3.Eatables\n4.Mens Items\n5.Womens Items"); 				// Showing The Main Sub Items
			choice_gen=Integer.parseInt(venki.readLine());		// Reading..
	
			if(choice_gen==1) 									//for stationary items
			{
				do{
					
				
				System.out.println("\n1.Pencils\n2.Erasers\n3.Sharpners\n4.Cardsheets\n5.ColourPapers\n6.Plain Papers\n7.Ruled Papers\n8.Pens\n9.Books\n10.Crayons/colour pencils\n11.Paints\n12.Geometry Items\n13.Glues\n14.Tapes\n15.Rulers\n16.Covers\n17.Other");//Showing All Stationary Items available in the store 
				choice_sta=Integer.parseInt(venki.readLine());	//reading the choice of customer for stationary items
				switch(choice_sta)
				{
												//Varities of the items
					case 1: System.out.println("\n\n1.Apsara  - 5/-\n2.Doms  - 5/-\n3.FuNn  - 5/-\n4.Natraj  - 5/-\n5.Camlin  -5/-");  
							int pencil=Integer.parseInt(venki.readLine());															  //reading the customers choice
							switch(pencil)
							{
								case 1: System.out.println("\nEnter the Quantity of the Pencil(s):");
										pencil_quantity=Integer.parseInt(venki.readLine());
										tot_pen=5*pencil_quantity;
										System.out.println("\nPencil Added");
								break;
								case 2: System.out.println("\nEnter the Quantity of the Pencil(s):");
										pencil_quantity=Integer.parseInt(venki.readLine());
										tot_pen=5*pencil_quantity;
										System.out.println("\nPencil Added");
								break;
								case 3: System.out.println("\nEnter the Quantity of the Pencil(s):");
										pencil_quantity=Integer.parseInt(venki.readLine());
										tot_pen=5*pencil_quantity;
										System.out.println("\nPencil Added");
								break;
								case 4: System.out.println("\nEnter the Quantity of the Pencil(s):");
										pencil_quantity=Integer.parseInt(venki.readLine());
										tot_pen=5*pencil_quantity;
										System.out.println("\nPencil Added");
								break;
								case 5: System.out.println("\nEnter the Quantity of the Pencil(s):");
										pencil_quantity=Integer.parseInt(venki.readLine());
										tot_pen=5*pencil_quantity;
										System.out.println("\nPencil Added");
								break;	
								default: System.out.println("\nINVALID CHOICE!");
							}
					break;
					
				tot_pencil+=tot_pen;										// calculating the total amount of pencil(s)  
					
					case 2: System.out.println("\n1.Apsara  - 5/-\n2.Doms  - 5/-\n3.FuNn  - 5/-\n4.Natraj  - 5/-\n5.Camlin  -5/-");  // Showing the Companies available in Erasers
							int eraser=Integer.parseInt(venki.readLine());	//Reading the customers choice
							switch(eraser)									//to enter the quantity,choose the company & calculate the amount 
							{
								case 1: System.out.println("\nEnter the Quantity of the Erasers(s):");
										eraser_quantity=Integer.parseInt(venki.readLine());
										tot_er=5*eraser_quantity;
										System.out.println("\nEraser Added");
								break;
								case 2: System.out.println("\nEnter the Quantity of the Erasers(s):");
										eraser_quantity=Integer.parseInt(venki.readLine());
										tot_er=5*eraser_quantity;
										System.out.println("\nEraser Added");
								break;
								case 3: System.out.println("\nEnter the Quantity of the Erasers(s):");
										eraser_quantity=Integer.parseInt(venki.readLine());
										tot_er=5*eraser_quantity;
										System.out.println("\nEraser Added");
								break;
								case 4: System.out.println("\nEnter the Quantity of the Erasers(s):");
										eraser_quantity=Integer.parseInt(venki.readLine());
										tot_er=5*eraser_quantity;
										System.out.println("\nEraser Added");
								break;
								case 5: System.out.println("\nEnter the Quantity of the Erasers(s):");
										eraser_quantity=Integer.parseInt(venki.readLine());
										tot_er=5*eraser_quantity;
										System.out.println("\nEraser Added");
								break;	
								default: System.out.println("\nINVALID CHOICE!");
							}
					break;
					
				tot_eraser+=tot_er;											  //Calculating the Erasers total
					case 3: System.out.println("\n1.Apsara  - 5/-\n2.Doms  - 5/-\n3.FuNn  - 5/-\n4.Natraj  - 5/-\n5.Camlin  -5/-");    // Showing the Companies available in Sharpners
							int sharpner=Integer.parseInt(venki.readLine()); //Reading the customers  choice	
							switch(sharpner)							//	to enter the quantity,choose the company & calculate the amount 
							{
								case 1: System.out.println("\nEnter the Quantity of the Sharpner(s):");
										sharpner_quantity=Integer.parseInt(venki.readLine());
										tot_sh=5*sharpner_quantity;
										System.out.println("\nSharpner Added");
								break;
								case 2: System.out.println("\nEnter the Quantity of the Sharpner(s):");
										sharpner_quantity=Integer.parseInt(venki.readLine());
										tot_sh=5*sharpner_quantity;
										System.out.println("\nSharpner Added");
								break;
								case 3: System.out.println("\nEnter the Quantity of the Sharpner(s):");
										sharpner_quantity=Integer.parseInt(venki.readLine());
										tot_sh=5*sharpner_quantity;
										System.out.println("\nSharpner Added");
								break;
								case 4: System.out.println("\nEnter the Quantity of the Sharpner(s):");
										sharpner_quantity=Integer.parseInt(venki.readLine());
										tot_sh=5*sharpner_quantity;
										System.out.println("\nSharpner Added");
								break;
								case 5: System.out.println("\nEnter the Quantity of the Sharpner(s):");
										sharpner_quantity=Integer.parseInt(venki.readLine());
										tot_sh=5*sharpner_quantity;
										System.out.println("\nSharpner Added");
								break;
								default: System.out.println("\nINVALID CHOICE!");
							}
					break;
				tot_sharpner+=tot_sh; //Calculating the amount....... 
					case 4: System.out.println("\n\nChoose the colour of your Card Sheet \n1.White - 5/-\n2.Blue - 5/-\n3.Yellow - 5/-\n4.Black- 5/-");  //showing the colours available
							cardsheet=Integer.parseInt(venki.radLine());		//Reading the Customers choice
							switch(cardsheet)									//to enter the quantity,choose the company & calculate the amount 
							{
								case 1: System.out.println("\nEnter the Quantity of the Card Sheet(s):");
										cardsheet_quantity=Integer.parseInt(venki.readLine());
										tot_cd=5*cardsheet_quantity;
										System.out.println("\nCard Sheet Added");
								break;
								case 2: System.out.println("\nEnter the Quantity of the Sharpner(s):");
										cardsheet_quantity=Integer.parseInt(venki.readLine());
										tot_cd=5*cardsheet_quantity;
										System.out.println("\nCard Sheet Added");
								break;
								case 3: System.out.println("\nEnter the Quantity of the Sharpner(s):");
										cardsheet_quantity=Integer.parseInt(venki.readLine());
										tot_cd=5*cardsheet_quantity;
										System.out.println("\nCard Sheet Added");
								break;
								case 4: System.out.println("\nEnter the Quantity of the Sharpner(s):");
										cardsheet_quantity=Integer.parseInt(venki.readLine());
										tot_cd=5*cardsheet_quantity;
										System.out.println("\nCard Sheet Added");
								break;
								default: System.out.println("\nINVALID CHOICE!");
							}
					break;
				tot_cardsheet+=tot_cd; 										//Calculating the total of CardSheets
					case 5: System.out.println("\n\nChoose the colour of your Colour Paper \n1.White - 10/-\n2.Blue - 10/-\n3.Yellow - 10/-\n4.Black- 10/-\n5.Purple-10/-\n6.Red- 10/-\n7.Green(Light)- 10/-\n8.Green(dark)- 10/-\n9.Brown-10/-\n10.Orange- 10/-");	//Showing the colours available 
							colourpaper=Integer.parseInt(venki.readLine());	//Reading the Customers choice
							switch(colourpaper)								//to enter the quantity,choose the company & calculate the amount 
							{
								case 1: System.out.println("\nEnter The Quantity of Your Paper(s):");
										colourpaper_quantity=Integer.parseInt(venki.readLine());
										tot_col=10*colourpaper_quantity;
										System.out.println("\nColour Paper Added");
								break;
								case 2: System.out.println("\nEnter The Quantity of Your Paper(s):");
										colourpaper_quantity=Integer.parseInt(venki.readLine());
										tot_col=10*colourpaper_quantity;
										System.out.println("\nColour Paper Added");
								break;
								case 3: System.out.println("\nEnter The Quantity of Your Paper(s):");
										colourpaper_quantity=Integer.parseInt(venki.readLine());
										tot_col=10*colourpaper_quantity;
										System.out.println("\nColour Paper Added");
								break;
								case 4: System.out.println("\nEnter The Quantity of Your Paper(s):");
										colourpaper_quantity=Integer.parseInt(venki.readLine());
										tot_col=10*colourpaper_quantity;
										System.out.println("\nColour Paper Added");
								break;
								case 5: System.out.println("\nEnter The Quantity of Your Paper(s):");
										colourpaper_quantity=Integer.parseInt(venki.readLine());
										tot_col=10*colourpaper_quantity;
										System.out.println("\nColour Paper Added");
								break;
								case 6: System.out.println("\nEnter The Quantity of Your Paper(s):");
										colourpaper_quantity=Integer.parseInt(venki.readLine());
										tot_col=10*colourpaper_quantity;
										System.out.println("\nColour Paper Added");
								break;
								case 7: System.out.println("\nEnter The Quantity of Your Paper(s):");
										colourpaper_quantity=Integer.parseInt(venki.readLine());
										tot_col=10*colourpaper_quantity;
										System.out.println("\nColour Paper Added");
								break;
								case 8:System.out.println("\nEnter The Quantity of Your Paper(s):");
										colourpaper_quantity=Integer.parseInt(venki.readLine());
										tot_col=10*colourpaper_quantity;
										System.out.println("\nColour Paper Added");
								break; 
								case 9: System.out.println("\nEnter The Quantity of Your Paper(s):");
										colourpaper_quantity=Integer.parseInt(venki.readLine());
										tot_col=10*colourpaper_quantity;
										System.out.println("\nColour Paper Added");
								break;
								case 10: System.out.println("\nEnter The Quantity of Your Paper(s):");
										 colourpaper_quantity=Integer.parseInt(venki.readLine());
										 tot_col=10*colourpaper_quantity;
										 System.out.println("\nColour Paper Added");
								break;
								default: System.out.println("\nINVALID CHOICE");
							}
					break;			
				tot_colourpapers+=tot_col;  								//Calculating thr total of Colour Papers
					case 6: System.out.println("\nEnter the Type of Papers You Want to Buy\n1.A4th Size - 5/-\n2.J.K bond - 5/-");  //Showing the types of papers available 
							int paper=Integer.parseInt(venki.readLine());	//Reading the Customers choice
							switch(paper)									// to enter the quantity,choose the company & calculate the amount 
							{
								case 1: System.out.println("\nEnter the Number of Papers you want to buy:");
										paper_quantity=Integer.parseInt(venki.readLine());
										tot_pa=5*paper_quantity;
										System.out.println("\nA4th Size Paper Added");
								break;
								case 2: System.out.println("\nEnter the Number of Papers you want to buy:");
										paper_quantity=Integer.parseInt(venki.readLine());
										tot_pa=5*paper_quantity;
										System.out.println("\nA4th Size Paper Added");
								default: System.out.println("INVALID CHOICE");
							}
					break;
				tot_paper+=tot_pa; 												//Calculating the total
					case 7: System.out.println("\nEnter the type of papers you want to buy:\n1.Long Size - 5/-\n2.Short size - 3/-\n3.A4th Size - 5/-"); //Showing the type of  papers available
							ruled_papers=Integer.parseInt(venki.readLine()); //Reading the customers choice
							switch(ruled_papers)							//to enter the quantity,choose the company & calculate the amount 
							{
								case 1: System.out.println("\nEnter the Amount of papers you want to buy:");		
										ruledpapers_quantity=Integer.parseInt(venki.readLine());
										tot_rp=ruledpapers_quantity*5;
										System.out.println("\nLong Ruled Papers Added");
								break;
								case 2: System.out.println("\nEnter the Amount of papers you want to buy:");
										ruledpapers_quantity=Integer.parseInt(venki.readLine());
										tot_rp=ruledpapers_quantity*3;
										System.out.println("\nShort Ruled Papers Added");
								break;
								case 3: System.out.println("\nEnter the Amount of papers you want to buy:");
										ruledpapers_quantity=Integer.parseInt(venki.readLine());
										tot_rp=ruledpapers_quantity*5;
										System.out.println("\nA4th Size Ruled Papers Added");
								break;
								default: System.out.println("\nINVALID CHOICE");
							}
					break;
				tot_ruledpapers+=tot_rp;    	//Calculating the total
					case 8: System.out.println("\nSorry Dear Customer Pens are Currently UNAVAILABLE! We Apologize for Inconvienience!!");
					break;
				
					case 9: System.out.println("\nChoose the Type of Books:\n1.Long Size - 40/- Any brand\n2.Short Size - 20/- Any brand\n3.King Size - 30/- Any brand"); //Showing sizes available
							int books=Integer.parseInt(venki.readLine());		//Reading the Customers choice
							switch(books)										//to enter the quantity / choose the company & calculate the amount 
							{
								case 1: System.out.println("\nEnter the Number the of Books you want to buy:");
										book_quantity=Integer.parseInt(venki.readLine());
										tot_bocos=book_quantity*40;
										System.out.println("\nBook Added");
								break;
								case 2: System.out.println("\nEnter the Number of books you want to buy:");
										book_quantity=Integer.parseInt(venki.readLine());
										tot_bocos=book_quantity*20;
										System.out.println("\nBook Added");
								break;
								case 3: System.out.println("\nEnter the Number of books you want to buy:");
										book_quantity=Integer.parseInt(venki.readLine());
										tot_bocos=book_quantity*30;
										System.out.println("\nBook Added");
								break;
								default: System.out.println("\nINVALID CHOICE");
							}
					break;
				tot_book+=tot_bocos;  											//Calculating the total 
					case 10: System.out.println("\nChoose one of the following: \n1.Crayons - 50/- \n2.Colour pencils 55/-");	// Showing the available items
							 int crapen=Integer.parseInt(venki.readLine());		// Reading customers choice
							 switch(crapen)										//to enter the quantity / choose the company & calculate the amount 
							 {
								 case 1: System.out.println("\nEnter the number of sets:");
										 crapen_quantity=Integer.parseInt(venki.readLine());
										 tot_crp=crapen_quantity*50;
										 System.out.println("\nCrayons Added");
								 break;
								 case 2: System.out.println("\nEnter the number of sets:");
										 crapen_quantity=Integer.parseInt(venki.readLine());
										 tot_crp=crapen_quantity*55;
										 System.out.println("\nColour Pencils Added");
								 break;
								 default: System.out.println("\nINVALID CHOICE");
							 }
						break;
				tot_crayonpen+=tot_crp; 									// Calculating the Total...
						case 11: System.out.println("\nChoose the number of colour paints you want\n1.8 paints - 15/-\n2.15 paints - 25/-\n3.30 paints - 50/-");	//Showing the items available
								 int paints=Integer.parseInt(venki.readLine());// Reading Customers Choice
								 switch(paints)								  //to enter the quantity / choose the company & calculate the amount 
								 {
									case 1: System.out.println("\nEnter the number of sets you want : ");
											paints_quantity=Integer.parseInt(venki.readLine());
											tot_pai=paints_quantity*15;
											System.out.println("\nPaints Added");
									break;
									case 2: System.out.println("\nEnter the number of sets you want to buy:");
											paints_quantity=Integer.parseInt(venki.readLine());
											tot_pai=paints_quantity*25;
											System.out.println("\nPaints Added");
									break;
									case 3: System.out.println("\nEnter the number of sets you want to buy:");
											paints_quantity=Integer.parseInt(venki.readLine());
											tot_pai=paints_quantity*50;
											System.out.println("\nPaints Added");
									break;
									default : System.out.println("\nINVALID CHOICE!");	
								 }
						break;
				tot_pain+=tot_pai;											// Calculating Total...
						case 12: System.out.println("\nChoose one of the following items you want to buy:\n1.Compass - 10\n2.Protractor - 5/-\n3.Divider - 5/-\n4.Complete Set - 25/-");	// Showing the items available
								 int geometery=Integer.parseInt(venki.readLine());
								 switch(geometery)								//to enter the quantity / choose the company & calculate the amount 
								 {
									case 1: System.out.println("\nEnter the number of pieces you want to buy:");
											geometery_quantity=Integer.parseInt(venki.readLine());
											tot_geo=geometery_quantity*10;
											System.out.println("\nCompass Added");
									break;
									case 2: System.out.println("\nEnter the number of pieces you want to buy:");
											geometery_quantity=Integer.parseInt(venki.readLine());
											tot_geo=geometery_quantity*5;
											System.out.println("\nProtractor Added");
									break;
									case 3: System.out.println("\nEnter the number of pieces you want to buy:");
											geometery_quantity=Integer.parseInt(venki.readLine());
											tot_geo=geometery_quantity*5;
											System.out.println("\nDivider Added");
									break;
									case 4: System.out.println("\nEnter the number of pieces you want to buy:");
											geometery_quantity=Integer.parseInt(venki.readLine());
											tot_geo=geometery_quantity*25;
											System.out.println("\n Set Added");
									break;
									default: System.out.printn("\nINVALID CHOICE");
								 }
						break;
				tot_geom+=tot_geo; 											// Calculating Total
						case 13: System.out.println("\nChoose the type of Glue you want to buy:\n1.Fevicol - 5/-\n2.Fevi Quick - 5/-\n3.Fevi Gum - 5/-\n4.Fevi Stick - 10/-");	//Showing the Items available
								 int glue=Integer.parseInt(venki.readLine());
								 switch(glue)									//to enter the quantity / choose the company & calculate the amount 
								 {
									case 1: System.out.println("\nEnter the number of bottles you want to buy:");
											glue_quantity=Intger.parseInt(venkil.readLine());
											tot_gl=glue_quantity*5;
											System.out.println("\nFEVICOL Added");
									break;
									case 2: System.out.println("\nEnter the number of bottles you want to buy:");
											glue_quantity=Intger.parseInt(venkil.readLine());
											tot_gl=glue_quantity*5;
											System.out.println("\nFEVI QUICK Added");
									break;
									case 3: System.out.println("\nEnter the number of bottles you want to buy:");
											glue_quantity=Intger.parseInt(venkil.readLine());
											tot_gl=glue_quantity*5;
											System.out.println("\nFEVI GUM Added");
									break;
									case 4: System.out.println("\nEnter the number of bottles you want to buy:");
											glue_quantity=Intger.parseInt(venkil.readLine());
											tot_gl=glue_quantity*10;
											System.out.println("\nFEVI STICK Added");
									break;
									default: System.out.println("\nINVALID CHOICE");
								}
						break;
					
				tot_glue+=tot_gl;					//Calculating the total 
						case 14: System.out.println("\nChoose the type of Tape you want to buy: \n1.Electric Black - 15/-\n2.Medical White tape - 10/-\n3.Regular Transparent - 20/-");	// Showing the items available
								 int tape=Integer.parseInt(venki.readLine());
								 switch(tape)			//to enter the quantity / choose the company & calculate the amount 
								 {
									 case 1: System.out.println("\nEnter the Number of tapes you want to buy:");
											 tape_quantity=Integer.parseInt(venki.readLine());
											 tot_tap=tape_quantity*15;
											 System.out.println("\nTape Added");
									break;
									case 2: System.out.println("\nEnter the Number of tapes you want to buy:");
											 tape_quantity=Integer.parseInt(venki.readLine());
											 tot_tap=tape_quantity*10;
											 System.out.println("\nTape Added");
									break;
									case 3: System.out.println("\nEnter the Number of tapes you want to buy:");
											 tape_quantity=Integer.parseInt(venki.readLine());
											 tot_tap=tape_quantity*20;
											 System.out.println("\nTape Added");
									break;
									default: System.out.println("\nINVALID CHOICE");
								 }
						break;
					
				tot_tape+=tot_tap;							//Calculating the total 
						case 15: System.out.println("\nChoose the size and type of ruler you want to buy:\n1.15cm Steel - 10/-\n2.15cm Plastic - 10/-\n3.30cm Steel - 30/-\n4.30cm Plastic - 25\n5.45cm Steel - 45/-");			//Showing the items available
								 int ruler=Intger.parseInt(venki.readLine());
								 switch(ruler)					//to enter the quantity / choose the company & calculate the amount 
								 {
									case 1: System.out.println("\nEnter the number of scales you want to buy:");
											ruler_quantity=Intger.parseInt(venkli.readLine());
											tot_rul=ruler_quantity*10;
											System.out.println("\nRuler Added");
									break;
									case 2: System.out.println("\nEnter the number of scales you want to buy:");
											ruler_quantity=Intger.parseInt(venkli.readLine());
											tot_rul=ruler_quantity*10;
											System.out.println("\nRuler Added");
									break;
									case 3: System.out.println("\nEnter the number of scales you want to buy:");
											ruler_quantity=Intger.parseInt(venkli.readLine());
											tot_rul=ruler_quantity*30;
											System.out.println("\nRuler Added");
									break;
									case 4: System.out.println("\nEnter the number of scales you want to buy:");
											ruler_quantity=Intger.parseInt(venkli.readLine());
											tot_rul=ruler_quantity*25;
											System.out.println("\nRuler Added");
									break;
									case 5: System.out.println("\nEnter the number of scales you want to buy:");
											ruler_quantity=Intger.parseInt(venkli.readLine());
											tot_rul=ruler_quantity*45;
											System.out.println("\nRuler Added");
									break;
									default: System.out.println("\nINVALID CHOICE");
								 }
						break;
				tot_rulers+=tot_rul;		//Calculating the Total
						case 16: System.out.println("\nChoose the Type of colour you want to buy:\n1.Brown Paper - 30/-\n2.Plastic Cover - 35/-");		//Showing the Available Items 
								 int cover=Integer.parseOInt(venki.readLine());
								 switch(cover)			//to enter the quantity / choose the company & calculate the amount 
								 {
									case 1: System.out.println("\nEnter the number of roll(s) you want to buy:");
											cover_quantity=Integer.parseInt(venki.readLine());
											tot_cov=cover_quantity*30;
											System.out.println("\nCover Added");
									break;
									case 2: System.out.println("\nEnter the number of roll(s) you want to buy:");
											cover_quantity=Integer.parseInt(venki.readLine());
											tot_cov=cover_quantity*35;
											System.out.println("\nCover Added");
									break;
									default: System.out.println("\nINVALID CHOICE");
								 }
						break;
				tot_cover+=tot_cov;  	//Calculating the total...
						case 17: System.out.println("\nEnter the Item you want to buy i.e not available in the above list:");  
								 String sta_other=venki.readLine();				//To Enter and buy the items not displayed
								 System.out.println("\nBuy any of 50/-");
								 int sta_oth=50;
								 System.out.println("\nEnter the quantity of the Item:");
								 int sta_other_quantity=Integer.parseInt(venki.readLine());
								int tot_other_sta=sta_other_quantity*50;
								 System.out.println("\nItem Entered");
						break;
						default:System.out.println("\nINVALID CHOICE");
						System.out.println("\nPress 1 to Continue shopping Stationary Items! OR Press 0 to EXIT");
						shop_sta=Integer.parseInt(venki.readLine());
				}
			  }	while(shop_sta!=0);		//to stop the loop if the customer has completed buying stationary items  
			}
		tot_sta=(tot_pencil)+(tot_eraser)+(tot_sharpner)+(tot_cardsheet)+(tot_colourpapers)+(tot_paper_)+(tot_ruledpapers)+(tot_book)+(tot_crayonpen)+(tot_pain)+(tot_geom+(tot_glue)+(tot_tape)+(tot_rulers)+(tot_cover)+(tot_other_sta);		// To Calculate the whole total of stationary items
			
			else if(choice_gen==2)				//    for  IT items 
			{
				System.out.println("\nChoose one of the Sub Items:\n1.Processor\n2.Graphics Card\n3.MotherBoard\n4.Monitor\n5.Mouse\n6.KeyBoard\n7.Speakers\n8.Head Phones\n9.Ear Phones\n10.UPS\n11.Pen Drives\n12.SD Card\n13.Camera\n14.Handy Camp\n");
				choice_it=Integer.parseInt(venki.readLine());
				do								//to enable the customer to buy multiple IT items 
				{
					System.out.println("\n\n\t\tNOTE : Only Top Quality Items Available!");
					System.out.println("\nChoose one of the Sub Items:\n1.Processor\n2.Graphics Card\n3.MotherBoard\n4.Monitor\n5.Mouse\n6.KeyBoard\n7.Speakers\n8.Head Phones\n9.Ear Phones\n10.UPS\n11.Pen Drives\n12.SD Card\n13.Camera\n14.CD\n15.DVD\n16.AntiVirus");         //Showing the items available 
					                            //Reading the customers choice
					choice_it=Integer.parseInt(venki.readLine());
					switch(choice_it)           //to enter the quantity / choose the company & calculate the amount 
					{
						case 1: System.out.println("\nChoose the Processor you want to buy:\n1.Intel Core i3 3rd Gen - 11,000/-\n2.Intel Core i3 5th Gen - 12,500/-\n3.Intel Core i5 5th Gen - 20,000\n4.Intel Core i7 3rd Gen - 25,000\n5.Intel Core i7 5th Gen - 28,900");
								int processor=Integer.parseInt(venki.readLine());
								switch(processor)
								{
									
									case 1: System.out.println("\nEnter the Quantity:");
											processor_quantity=Integer.parseInt(venki.readLine());
											tot_proce=processor_quantity*11000;
											System.out.println("\nProcessor Added");
									break; 
									case 2: System.out.println("\nEnter the Quantity:");
											processor_quantity=Integer.parseInt(venki.readLine());
											tot_proce=processor_quantity*12500;
											System.out.println("\nProcessor Added");
									break; 
									case 3: System.out.println("\nEnter the Quantity:");
											processor_quantity=Integer.parseInt(venki.readLine());
											tot_proce=processor_quantity*20000;
											System.out.println("\nProcessor Added");
									break; 
									case 4: System.out.println("\nEnter the Quantity:");
											processor_quantity=Integer.parseInt(venki.readLine());
											tot_proce=processor_quantity*25000;
											System.out.println("\nProcessor Added");
									break; 
									case 5: System.out.println("\nEnter the Quantity:");
											processor_quantity=Integer.parseInt(venki.readLine());
											tot_proce=processor_quantity*28900;
											System.out.println("\nProcessor Added");
									break;
									default: System.out.println("\nINVALID CHOICE");
								}
						break;default: System.out.println("\nINVALID CHOICE");
				tot_processor+=tot_proce;                                                  //Calculating the total...
						case 2: System.out.println("\nChoose the Graphics Card you want to Buy:\n1.NVIDIA GeForce GTX Titan X - 8700/-\n2.NVIDIA GeForce ZOtac - 2500\n3.NVIDIA GeForce GTX 970 - 2550\n4.AMD Radeon R9290 - 2200/-\n5.AMD Radeon R9295X2 - 3200/-");        //Showing the items available
								int graphics=Integer.parseInt(venki.readLine());               //Reading the customers  choice
								switch(graphics)                                              //to enter the quantity / choose the company & calculate the amount 
								{
									case 1: System.out.println("\nEnter the Quantity:");
											graphic_quantity=Integer.parseInt(venki.readLine());
											tot_gra=8700*graphic_quantity;
											System.out.println("\nGraphics Card Added");
									break;
									case 2: System.out.println("\nEnter the Quantity:");
											graphic_quantity=Integer.parseInt(venki.readLine());
											tot_gra=2500*graphic_quantity;
											System.out.println("\nGraphics Card Added");
									break;
									case 3: System.out.println("\nEnter the Quantity:");
											graphic_quantity=Integer.parseInt(venki.readLine());
											tot_gra=25500*graphic_quantity;
											System.out.println("\nGraphics Card Added");
									break;
									case 4: System.out.println("\nEnter the Quantity:");
											graphic_quantity=Integer.parseInt(venki.readLine());
											tot_gra=2200*graphic_quantity;
											System.out.println("\nGraphics Card Added");
									break;
									case 5: System.out.println("\nEnter the Quantity:");cls

											graphic_quantity=Integer.parseInt(venki.readLine());
											tot_gra=3200*graphic_quantity;
											System.out.println("\nGraphics Card Added");
									break;
									default: System.out.println("\nINVALID CHOICE");
								}
						break;
				tot_graphics+=tot_gra;                       //To calculate the total 
						case 3: System.out.println("\nChoose the MotherBoard you want to buy:\n1.MSI 970 Gaming - 17900/-\n2.Asus Z170 Deluxe - 13001/-\n3.Asus X99 Deluxe - 30,999/-\n4.Intel GigaByte - 10,000/-\n5.Intel Sandy Bridge - 25,000/-");   //Showing the items available
								int motherboard=Integer.parseInt(venki.readLine());    //Reading the customers choice
								switch(motherboard)                                   //to enter the quantity / choose the company & calculate the amount 
								{
									case 1: System.out.println("\nEnter the quantity:");
											motherboard_quantity=Integer.parseInt(venki.readLine());
											tot_moth=17900*motherboard_quantity;
											System.out.println("\nMotherBoard Added!");
									break;
									case 2: System.out.println("\nEnter the quantity:");
											motherboard_quantity=Integer.parseInt(venki.readLine());
											tot_moth=13001*motherboard_quantity;
											System.out.println("\nMotherBoard Added!");
									break;
									case 3: System.out.println("\nEnter the quantity:");
											motherboard_quantity=Integer.parseInt(venki.readLine());
											tot_moth=30999*motherboard_quantity;
											System.out.println("\nMotherBoard Added!");
									break;
									case 4: System.out.println("\nEnter the quantity:");
											motherboard_quantity=Integer.parseInt(venki.readLine());
											tot_moth+=10000*motherboard_quantity;
											System.out.println("\nMotherBoard Added!");
									break;
									case 5: System.out.println("\nEnter the quantity:");
											motherboard_quantity=Integer.parseInt(venki.readLine());
											tot_moth+=25000*motherboard_quantity;
											System.out.println("\nMotherBoard Added!");
									break;
									default:System.out.println("\nINVALID CHOICE!");
								}
						break;
				tot_motherboard+=tot_moth;                             //Calculating the total 
						case 5: System.out.println("\nChoose the type of mouse you want: \n1.Logitech G602 WireLess - 790/-\n2.Dell Wired - 500/-\n3.Pencilic Bluetooth Mouse - 990/-\n4.Microsoft Sculpt Mobile Mouse - 1000/-\n5.i-Ball wired - 670/-\n6.Roccat Tyon - 700/-");       //Showing the available items 
								int mouse=Integer.parseInt(venki.readLine()); //Reading the Customers choice.....
								switch(mouse)                      //to enter the quantity / choose the company & calculate the amount 
								{
									case 1: System.out.println("\nEnter the Quantity:");
											mouse_quantity=Integer.parseInt(venki.readLine());
											tot_mou=790*mouse_quantity;
											System.out.println("\nMouse Added!");
									break;
									case 2: System.out.println("\nEnter the Quantity:");
											mouse_quantity=Integer.parseInt(venki.readLine());
											tot_mou=500*mouse_quantity;
											System.out.println("\nMouse Added!");
									break;
									case 3: System.out.println("\nEnter the Quantity:");
											mouse_quantity=Integer.parseInt(venki.readLine());
											tot_mou=990*mouse_quantity;
											System.out.println("\nMouse Added!");
									break;
									case 4: System.out.println("\nEnter the Quantity:");
											mouse_quantity=Integer.parseInt(venki.readLine());
											tot_mou=1000*mouse_quantity;
											System.out.println("\nMouse Added!");
									break;
									case 5: System.out.println("\nEnter the Quantity:");
											mouse_quantity=Integer.parseInt(venki.readLine());
											tot_mou=670*mouse_quantity;
											System.out.println("\nMouse Added!");
									break;
									case 6: System.out.println("\nEnter the Quantity:");
											mouse_quantity=Integer.parseInt(venki.readLine());
											tot_mou=700*mouse_quantity;
											System.out.println("\nMouse Added!");
									break;
									default:System.out.println("\nINVALID CHOICE");
								}
						break;
				tot_mouse+=tot_mou;                                //Calculating the total 
						case 6: System.out.println("\nChoose the Key Board:\n1.Corsair K99.RGB - 1890/-\n2.Roccat Ryos MK Pro - 1690/-\n3.i-Ball - 2000/-\n4.Dell - 5000/-\n5.Microsoft All-in one - 5555/-\n6.Media Keyboard - 3200/-\n7.Topre Type Heaven - 1500/-");        //Showing the items available 
								int keyboard=Integer.parseInt(venki.readLine());    // Reading the customers choice 
								switch(keyboard)                              //to enter the quantity / choose the company & calculate the amount 
								{
									case 1: System.out.println("\nEnter the quantity:");
											keyboard_quantity=Integer.parseInt(venki.readLine());
											tot_key=keyboard_quantity*1890;
											System.out.println("\nKeyBoard Added");
									break;
									case 2: System.out.println("\nEnter the quantity:");
											keyboard_quantity=Integer.parseInt(venki.readLine());
											tot_key=keyboard_quantity*1690;
											System.out.println("\nKeyBoard Added");
									break;
									case 3: System.out.println("\nEnter the quantity:");
											keyboard_quantity=Integer.parseInt(venki.readLine());
											tot_key=keyboard_quantity*2000;
											System.out.println("\nKeyBoard Added");
									break;
									case 4: System.out.println("\nEnter the quantity:");
											keyboard_quantity=Integer.parseInt(venki.readLine());
											tot_key=keyboard_quantity*5000;
											System.out.println("\nKeyBoard Added");
									break;
									case 5: System.out.println("\nEnter the quantity:");
											keyboard_quantity=Integer.parseInt(venki.readLine());
											tot_key=keyboard_quantity*5555;
											System.out.println("\nKeyBoard Added");
									break;
									case 6: System.out.println("\nEnter the quantity:");
											keyboard_quantity=Integer.parseInt(venki.readLine());
											tot_key=keyboard_quantity*3200;
											System.out.println("\nKeyBoard Added");
									break;
									case 7: System.out.println("\nEnter the quantity:");
											keyboard_quantity=Integer.parseInt(venki.readLine());
											tot_key=keyboard_quantity*1500;
											System.out.println("\nKeyBoard Added");
									break;
									default: System.out.println("\nINVALID CHOICE!");
								}
						break;
				tot_keyboard+=tot_key;         //Calculating the total 
						case 7: System.out.println("\nChoose the type of Speaker you want:\n1.Audio Engine 5+ - 3900/-\n2Harman Karden Aura - 4500/-\n3.REF X300A - 2050/-\n4.JBL Series323R305 - 1990/-\n5.Intex - 2500/-\n6.M-Audio BX5 Carbon - 3520/-");       //Showing the available items 
								int speaker=Integer.parseInt(venki.readLine());    //Reading the Customers choice 
								switch(speaker)                          //to enter the quantity / choose the company & calculate the amount 
								{
									case 1: System.out.println("\nEnter the quantity:");
											speaker_quantity=Integer.parseInt(venki.readLine());
											tot_spea=speaker_quantity*3900;
											System.out.println("\nSpeaker Added!");
									break;
									case 2: System.out.println("\nEnter the quantity:");
											speaker_quantity=Integer.parseInt(venki.readLine());
											tot_spea=speaker_quantity*4500;
											System.out.println("\nSpeaker Added!");
									break;
									case 3: System.out.println("\nEnter the quantity:");
											speaker_quantity=Integer.parseInt(venki.readLine());
											tot_spea=speaker_quantity*2050;
											System.out.println("\nSpeaker Added!");
									break;
									case 4: System.out.println("\nEnter the quantity:");
											speaker_quantity=Integer.parseInt(venki.readLine());
											tot_spea=speaker_quantity*1990;
											System.out.println("\nSpeaker Added!");
									break;
									case 5: System.out.println("\nEnter the quantity:");
											speaker_quantity=Integer.parseInt(venki.readLine());
											tot_spea=speaker_quantity*2500;
											System.out.println("\nSpeaker Added!");
									break;
									case 6: System.out.println("\nEnter the quantity:");
											speaker_quantity=Integer.parseInt(venki.readLine());
											tot_spea=speaker_quantity*3520;
											System.out.println("\nSpeaker Added!");
									break;
									default:System.out.println("\nINVALID CHOICE!");
								}
						break;
				tot_speaker+=tot_spea;     //Calculating the total
						case 8: System.out.println("\nChoose your Head phone Type : \n1.Semheiser Urbanite XL Wireless - 2490/-\n2.Griffin Wood Tones - 1750\n3.Wilkins p5 - 3990\n4.Sennheiser HD6 Mix - 1940\n5.Sony MDR-IA - 1490/-\n6.Shure SRH145Mp - 4910/-\n7.Intex - 2500/-\n8.i-ball - 3900/-\n9.Marshall Major II - 1190/-");
								int headphone=Integer.parseInt(venki.readLine());
								switch(headphones)
								{
									case 1: System.out.println("\nEnter the quantity:");
											headphone_quantity=Integer.parseInt(venki.readLine());
											tot_head=2490*headphone_quantity;
											System.out.println("\nHead Phones Added!");
									break;
									case 2: System.out.println("\nEnter the quantity:");
											headphone_quantity=Integer.parseInt(venki.readLine());
											tot_head=1750*headphone_quantity;
											System.out.println("\nHead Phones Added!");
									break;
									case 3: System.out.println("\nEnter the quantity:");
											headphone_quantity=Integer.parseInt(venki.readLine());
											tot_head=3390*headphone_quantity;
											System.out.println("\nHead Phones Added!");
									break;
									case 4: System.out.println("\nEnter the quantity:");
											headphone_quantity=Integer.parseInt(venki.readLine());
											tot_head=1390*headphone_quantity;
											System.out.println("\nHead Phones Added!");
									break;
									case 5: System.out.println("\nEnter the quantity:");
											headphone_quantity=Integer.parseInt(venki.readLine());
											tot_head=2980*headphone_quantity;
											System.out.println("\nHead Phones Added!");
									break;
									case 6: System.out.println("\nEnter the quantity:");
											headphone_quantity=Integer.parseInt(venki.readLine());
											tot_head=4910*headphone_quantity;
											System.out.println("\nHead Phones Added!");
									break;
									case 7: System.out.println("\nEnter the quantity:");
											headphone_quantity=Integer.parseInt(venki.readLine());
											tot_head=2500*headphone_quantity;
											System.out.println("\nHead Phones Added!");
									break;
									case 8: System.out.println("\nEnter the quantity:");
											headphone_quantity=Integer.parseInt(venki.readLine());
											tot_head=3900*headphone_quantity;
											System.out.println("\nHead Phones Added!");
									break;
									case 9: System.out.println("\nEnter the quantity:");
											headphone_quantity=Integer.parseInt(venki.readLine());
											tot_head=1190*headphone_quantity;
											System.out.println("\nHead Phones Added!");
									break;
									default:System.out.println("\nINVALID CHOICE");
								}
						break;
			     tot_headphone+=tot_head;
						case 9: System.out.println("\nChoose the type of Ear Phones you want to buy:\n1.Base Comfort - 149/-\n2.Wilkins CS - 80/-\n3.Technica - 239/-\n4.RHA - 200/-\n5.Intex - 200/-\n6.Samsung - 225/-\n7.Sony - 259/-\n8.JBL - 112");
								int earphone=Integer.parseInt(venki.readLine());
								switch(earphone)
								{
									case 1: System.out.println("\nEnter the quantity:");
											earphone_quantity=Integer.parseInt(venki.readLine());
											tot_ear=149*ear_quantity;
											System.out.println("\nEar Phones Added");
									break;
									case 2: System.out.println("\nEnter the quantity:");
											earphone_quantity=Integer.parseInt(venki.readLine());
											tot_ear=80*ear_quantity;
											System.out.println("\nEar Phones Added");
									break;
									case 3: System.out.println("\nEnter the quantity:");
											earphone_quantity=Integer.parseInt(venki.readLine());
											tot_ear=239*ear_quantity;
											System.out.println("\nEar Phones Added");
									break;
									case 4: System.out.println("\nEnter the quantity:");
											earphone_quantity=Integer.parseInt(venki.readLine());
											tot_ear=200*ear_quantity;
											System.out.println("\nEar Phones Added");
									break;
									case 5: System.out.println("\nEnter the quantity:");
											earphone_quantity=Integer.parseInt(venki.readLine());
											tot_ear=200*ear_quantity;
											System.out.println("\nEar Phones Added");
									break;
									case 6: System.out.println("\nEnter the quantity:");
											earphone_quantity=Integer.parseInt(venki.readLine());
											tot_ear=225*ear_quantity;
											System.out.println("\nEar Phones Added");
									break;
									case 7: System.out.println("\nEnter the quantity:");
											earphone_quantity=Integer.parseInt(venki.readLine());
											tot_ear=259*ear_quantity;
											System.out.println("\nEar Phones Added");
									break;
									case 8: System.out.println("\nEnter the quantity:");
											earphone_quantity=Integer.parseInt(venki.readLine());
											tot_ear=112*ear_quantity;
											System.out.println("\nEar Phones Added");
									break;
									default:System.out.println("\nINVALID CHOICE");
								}
						break;
				tot_earphone+=tot_ear;
						case 10: System.out.println("\nChoose the Type you want:\n1.Microtea 625 VA - 1425/-\n2.Microtea 650 VA - 1523/-\n3.Beetel 700 VA - 1047/-\n4.APC 600 VA - 1800/-\n5.Intex 600 VA - 1047/-\n6.297 Microtea 1K VA - 3190");
								 int ups=Integer.parseInt(venki.readLine());
								 switch(ups)
								 {
									case 1: Systm.out.println("\nEnter the quantity:");
											ups_quantity=Integer.parseInt(venki.readLine());
											tot_up=ups_quantity*1452;
											System.out.println("\nUPS ADDED!");
									break;
									case 2: Systm.out.println("\nEnter the quantity:");
											ups_quantity=Integer.parseInt(venki.readLine());
											tot_up=ups_quantity*1523;
											System.out.println("\nUPS ADDED!");
									break;
									case 3: Systm.out.println("\nEnter the quantity:");
											ups_quantity=Integer.parseInt(venki.readLine());
											tot_up=ups_quantity*1047;
											System.out.println("\nUPS ADDED!");
									break;
									case 4: Systm.out.println("\nEnter the quantity:");
											ups_quantity=Integer.parseInt(venki.readLine());
											tot_up=ups_quantity*1800;
											System.out.println("\nUPS ADDED!");
									break;
									case 5: Systm.out.println("\nEnter the quantity:");
											ups_quantity=Integer.parseInt(venki.readLine());
											tot_up=ups_quantity*1047;
											System.out.println("\nUPS ADDED!");
									break;
									case 6: Systm.out.println("\nEnter the quantity:");
											ups_quantity=Integer.parseInt(venki.readLine());
											tot_up=ups_quantity*3190;
											System.out.println("\nUPS ADDED!");
									break;
									default: System.out.println("\nINVALID CHOICE");
								 }
						break;
				tot_ups+=tot_up;
						case 11:System.out.println("\nChoose the type of Pen Drive you want:\n1. 4Gb\n2. 8Gb\n3. 16Gb\n4. 32Gb\n5. 64Gb\n6. 128Gb");
								int pendrive=Integer.parseInt(venki.readLine()); 
								switch(pendrive)
								{
									case 1:System.out.println("\nChoose the brand : \n1.Sony - 150/-\n2.Transcend - 130/-\n3.Sandisk - 125/-\n4.Hp - 135/-\n5.Samsung - 150/-\n6.Moser Baer - 90/-\n7.Strontium - 145/-");
										   pen_company_choice=Integer.parseInt(venki.readLine());
										   switch(pen_company_choice)
										   {
											    case 1:  System.out.println("\nEnter the quantity:");
														pen_quantity=Integer.parseInt(venki.readLine());
														tot_pend=pen_quantity*150;
														System.out.println("\nPen Drive Added");
												break;
											    case 2:  System.out.println("\nEnter the quantity:");
														pen_quantity=Integer.parseInt(venki.readLine());
														tot_pend=pen_quantity*130;
														System.out.println("\nPen Drive Added");
												break;
											    case 3:  System.out.println("\nEnter the quantity:");
														pen_quantity=Integer.parseInt(venki.readLine());
														tot_pend=pen_quantity*125;
														System.out.println("\nPen Drive Added");
												break;
											    case 4:  System.out.println("\nEnter the quantity:");
														pen_quantity=Integer.parseInt(venki.readLine());
														tot_pend=pen_quantity*135;
														System.out.println("\nPen Drive Added");
												break;
											    case 5:  System.out.println("\nEnter the quantity:");
														pen_quantity=Integer.parseInt(venki.readLine());
														tot_pend=pen_quantity*150;
														System.out.println("\nPen Drive Added");
												break;
											    case 6:  System.out.println("\nEnter the quantity:");
														pen_quantity=Integer.parseInt(venki.readLine());
														tot_pend=pen_quantity*90;
														System.out.println("\nPen Drive Added");
												break;
											    case 7:  System.out.println("\nEnter the quantity:");
														pen_quantity=Integer.parseInt(venki.readLine());
														tot_pend=pen_quantity*145;
														System.out.println("\nPen Drive Added");
												break;
												default: System.out.println("INVALID CHOICE");
										   }
									break;
									case 2: System.out.println("\nChoose the Brand:\n1.Sony - 250/-\n2.Transcend - 230/-\n3.Sandisk - 225/-\n4.Hp - 235/-\n5.Samsung - 150/-\n6.Moser Baer - 290/-\n7.Strontium - 245/-");
											pen_company_choice=Integer.parseInt(venki.readLine());
											switch(pen_company_choice)
											{
												case 1:  System.out.println("\nEnter the quantity:");
														pen_quantity=Integer.parseInt(venki.readLine());
														tot_pend=pen_quantity*250;
														System.out.println("\nPen Drive Added");
												break;
											    case 2:  System.out.println("\nEnter the quantity:");
														pen_quantity=Integer.parseInt(venki.readLine());
														tot_pend=pen_quantity*230;
														System.out.println("\nPen Drive Added");
												break;
											    case 3:  System.out.println("\nEnter the quantity:");
														pen_quantity=Integer.parseInt(venki.readLine());
														tot_pend=pen_quantity*225;
														System.out.println("\nPen Drive Added");
												break;
											    case 4:  System.out.println("\nEnter the quantity:");
														pen_quantity=Integer.parseInt(venki.readLine());
														tot_pend=pen_quantity*235;
														System.out.println("\nPen Drive Added");
												break;
											    case 5:  System.out.println("\nEnter the quantity:");
														pen_quantity=Integer.parseInt(venki.readLine());
														tot_pend=pen_quantity*250;
														System.out.println("\nPen Drive Added");
												break;
											    case 6:  System.out.println("\nEnter the quantity:");
														pen_quantity=Integer.parseInt(venki.readLine());
														tot_pend=pen_quantity*290;
														System.out.println("\nPen Drive Added");
												break;
											    case 7:  System.out.println("\nEnter the quantity:");
														pen_quantity=Integer.parseInt(venki.readLine());
														tot_pend=pen_quantity*245;
														System.out.println("\nPen Drive Added");
												break;
												default: System.out.println("INVALID CHOICE");
											}
									break;
									case 3: System.out.println("\nChoose the Brand:\n1.Sony - 350/-\n2.Transcend - 330/-\n3.Sandisk - 325/-\n4.Hp - 335/-\n5.Samsung - 350/-\n6.Moser Baer - 390/-\n7.Strontium - 345/-");
											pen_company_choice=Integer.parseInt(venki.readLine());
											switch(pen_company_choice)
											{
												case 1:  System.out.println("\nEnter the quantity:");
														pen_quantity=Integer.parseInt(venki.readLine());
														tot_pend=pen_quantity*350;
														System.out.println("\nPen Drive Added");
												break;
											    case 2:  System.out.println("\nEnter the quantity:");
														pen_quantity=Integer.parseInt(venki.readLine());
														tot_pend=pen_quantity*330;
														System.out.println("\nPen Drive Added");
												break;
											    case 3:  System.out.println("\nEnter the quantity:");
														pen_quantity=Integer.parseInt(venki.readLine());
														tot_pend=pen_quantity*325;
														System.out.println("\nPen Drive Added");
												break;
											    case 4:  System.out.println("\nEnter the quantity:");
														pen_quantity=Integer.parseInt(venki.readLine());
														tot_pend=pen_quantity*335;
														System.out.println("\nPen Drive Added");
												break;
											    case 5:  System.out.println("\nEnter the quantity:");
														pen_quantity=Integer.parseInt(venki.readLine());
														tot_pend=pen_quantity*350;
														System.out.println("\nPen Drive Added");
												break;
											    case 6:  System.out.println("\nEnter the quantity:");
														pen_quantity=Integer.parseInt(venki.readLine());
														tot_pend=pen_quantity*390;
														System.out.println("\nPen Drive Added");
												break;
											    case 7:  System.out.println("\nEnter the quantity:");
														pen_quantity=Integer.parseInt(venki.readLine());
														tot_pend=pen_quantity*345;
														System.out.println("\nPen Drive Added");
												break;
												default: System.out.println("INVALID CHOICE");
											}
									break;
									case 4: System.out.println("\nChoose the Brand:\n1.Sony - 750/-\n2.Transcend - 730/-\n3.Sandisk - 725/-\n4.Hp - 235/-\n5.Samsung - 750/-\n6.Moser Baer - 690/-\n7.Strontium - 745/-");
											pen_company_choice=Integer.parseInt(venki.readLine());
											switch(pen_company_choice)
											{
												case 1:  System.out.println("\nEnter the quantity:");
														pen_quantity=Integer.parseInt(venki.readLine());
														tot_pend=pen_quantity*750;
														System.out.println("\nPen Drive Added");
												break;
											    case 2:  System.out.println("\nEnter the quantity:");
														pen_quantity=Integer.parseInt(venki.readLine());
														tot_pend=pen_quantity*730;
														System.out.println("\nPen Drive Added");
												break;
											    case 3:  System.out.println("\nEnter the quantity:");
														pen_quantity=Integer.parseInt(venki.readLine());
														tot_pend=pen_quantity*725;
														System.out.println("\nPen Drive Added");
												break;
											    case 4:  System.out.println("\nEnter the quantity:");
														pen_quantity=Integer.parseInt(venki.readLine());
														tot_pend=pen_quantity*735;
														System.out.println("\nPen Drive Added");
												break;
											    case 5:  System.out.println("\nEnter the quantity:");
														pen_quantity=Integer.parseInt(venki.readLine());
														tot_pend=pen_quantity*750;
														System.out.println("\nPen Drive Added");
												break;
											    case 6:  System.out.println("\nEnter the quantity:");
														pen_quantity=Integer.parseInt(venki.readLine());
														tot_pend=pen_quantity*690;
														System.out.println("\nPen Drive Added");
												break;
											    case 7:  System.out.println("\nEnter the quantity:");
														pen_quantity=Integer.parseInt(venki.readLine());
														tot_pend=pen_quantity*745;
														System.out.println("\nPen Drive Added");
												break;
												default: System.out.println("INVALID CHOICE");
											}
									break;
									case 5: System.out.println("\nChoose the Brand:\n1.Sony - 250/-\n2.Transcend - 930/-\n3.Sandisk - 925/-\n4.Hp - 935/-\n5.Samsung - 950/-\n6.Moser Baer - 990/-\n7.Strontium - 945/-");
											pen_company_choice=Integer.parseInt(venki.readLine());
											switch(pen_company_choice)
											{
												case 1:  System.out.println("\nEnter the quantity:");
														pen_quantity=Integer.parseInt(venki.readLine());
														tot_pend=pen_quantity*950;
														System.out.println("\nPen Drive Added");
												break;
											    case 2:  System.out.println("\nEnter the quantity:");
														pen_quantity=Integer.parseInt(venki.readLine());
														tot_pend=pen_quantity*930;
														System.out.println("\nPen Drive Added");
												break;
											    case 3:  System.out.println("\nEnter the quantity:");
														pen_quantity=Integer.parseInt(venki.readLine());
														tot_pend=pen_quantity*925;
														System.out.println("\nPen Drive Added");
												break;
											    case 4:  System.out.println("\nEnter the quantity:");
														pen_quantity=Integer.parseInt(venki.readLine());
														tot_pend=pen_quantity*935;
														System.out.println("\nPen Drive Added");
												break;
											    case 5:  System.out.println("\nEnter the quantity:");
														pen_quantity=Integer.parseInt(venki.readLine());
														tot_pend=pen_quantity*950;
														System.out.println("\nPen Drive Added");
												break;
											    case 6:  System.out.println("\nEnter the quantity:");
														pen_quantity=Integer.parseInt(venki.readLine());
														tot_pend=pen_quantity*990;
														System.out.println("\nPen Drive Added");
												break;
											    case 7:  System.out.println("\nEnter the quantity:");
														pen_quantity=Integer.parseInt(venki.readLine());
														tot_pend=pen_quantity*945;
														System.out.println("\nPen Drive Added");
												break;
												default: System.out.println("INVALID CHOICE");
											}
									break;
									case 6: System.out.println("\nChoose the Brand:\n1.Sony - 1250/-\n2.Transcend - 1230/-\n3.Sandisk - 1225/-\n4.Hp - 1235/-\n5.Samsung - 1150/-\n6.Moser Baer - 1290/-\n7.Strontium - 1245/-");
											pen_company_choice=Integer.parseInt(venki.readLine());
											switch(pen_company_choice)
											{
												case 1:  System.out.println("\nEnter the quantity:");
														pen_quantity=Integer.parseInt(venki.readLine());
														tot_pend=pen_quantity*1250;
														System.out.println("\nPen Drive Added");
												break;
											    case 2:  System.out.println("\nEnter the quantity:");
														pen_quantity=Integer.parseInt(venki.readLine());
														tot_pend=pen_quantity*1230;
														System.out.println("\nPen Drive Added");
												break;
											    case 3:  System.out.println("\nEnter the quantity:");
														pen_quantity=Integer.parseInt(venki.readLine());
														tot_pend=pen_quantity*1225;
														System.out.println("\nPen Drive Added");
												break;
											    case 4:  System.out.println("\nEnter the quantity:");
														pen_quantity=Integer.parseInt(venki.readLine());
														tot_pend=pen_quantity*1235;
														System.out.println("\nPen Drive Added");
												break;
											    case 5:  System.out.println("\nEnter the quantity:");
														pen_quantity=Integer.parseInt(venki.readLine());
														tot_pend=pen_quantity*1250;
														System.out.println("\nPen Drive Added");
												break;
											    case 6:  System.out.println("\nEnter the quantity:");
														pen_quantity=Integer.parseInt(venki.readLine());
														tot_pend=pen_quantity*1290;
														System.out.println("\nPen Drive Added");
												break;
											    case 7:  System.out.println("\nEnter the quantity:");
														pen_quantity=Integer.parseInt(venki.readLine());
														tot_pend=pen_quantity*1245;
														System.out.println("\nPen Drive Added");
												break;
												default: System.out.println("INVALID CHOICE");
											}
									break;
									default: System.out.println("\nINVALID CHOICE!");
								}
					                                    
				tot_pendrive+=tot_pend;
						case 12: System.out.println("\nChoose the Memory  Size of Our SD Card:\n1. 1Gb \n2. 4Gb  \n3. 8Gb \n4. 16Gb \n5. 32Gb \n6. 64Gb");
								 int sdcard=Integer.parseInt(venki.readLine());
								 switch(sdcard)
								 {
									case 1: System.out.println("\nChoose the Brand:\n1.Sony - 60/-\n2.Transcend - 55/-\n3.SanDisk - 59/-\n4.Hp - 50/-\n5.Moser Baer - 30/-\n6.Strontium - 65/-");
											 sd_company_choice=Integer.parseInt(venki.readLine());
											 switch(sd_company_choice)
											{
											    case 1: System.out.println("\nEnter the Quantity:");
														sdcard_quantity=Integer.parseInt(vewnki.readLine());
														tot_sd=sdcard_quantity*60;
														System.out.println("\nSd Card Added!");
												break;
											    case 2: System.out.println("\nEnter the Quantity:");
														sdcard_quantity=Integer.parseInt(vewnki.readLine());
														tot_sd=sdcard_quantity*55;
														System.out.println("\nSd Card Added!");
												break;
											    case 3: System.out.println("\nEnter the Quantity:");
														sdcard_quantity=Integer.parseInt(vewnki.readLine());
														tot_sd=sdcard_quantity*59;
														System.out.println("\nSd Card Added!");
												break;
											    case 4: System.out.println("\nEnter the Quantity:");
														sdcard_quantity=Integer.parseInt(vewnki.readLine());
														tot_sd=sdcard_quantity*50;
														System.out.println("\nSd Card Added!");
												break;
											    case 5: System.out.println("\nEnter the Quantity:");
														sdcard_quantity=Integer.parseInt(vewnki.readLine());
														tot_sd=sdcard_quantity*30;
														System.out.println("\nSd Card Added!");
												break;
											    case 6: System.out.println("\nEnter the Quantity:");
														sdcard_quantity=Integer.parseInt(vewnki.readLine());
														tot_sd=sdcard_quantity*65;
														System.out.println("\nSd Card Added!");
												break;
												default:System.out.println("\nINVALID CHOICE!");
											}
									break;
									case 2: System.out.println("\nChoose the Brand:\n1.Sony - 125/-\n2.Transcend - 145/-\n3.SanDisk - 130/-\n4.Hp - 110/-\n5.Moser Baer - 99/-\n6.Strontium - 155/-");
											 sd_company_choice=Integer.parseInt(venki.readLine());
											 switch(sd_company_choice)
											{
											    case 1: System.out.println("\nEnter the Quantity:");
														sdcard_quantity=Integer.parseInt(venki.readLine());
														tot_sd=sdcard_quantity*125;
														System.out.println("\nSd Card Added!");
												break;
											    case 2: System.out.println("\nEnter the Quantity:");
														sdcard_quantity=Integer.parseInt(venki.readLine());
														tot_sd=sdcard_quantity*145;
														System.out.println("\nSd Card Added!");
												break;
											    case 3: System.out.println("\nEnter the Quantity:");
														sdcard_quantity=Integer.parseInt(venki.readLine());
														tot_sd=sdcard_quantity*130;
														System.out.println("\nSd Card Added!");
												break;
											    case 4: System.out.println("\nEnter the Quantity:");
														sdcard_quantity=Integer.parseInt(venki.readLine());
														tot_sd=sdcard_quantity*110;
														System.out.println("\nSd Card Added!");
												break;
											    case 5: System.out.println("\nEnter the Quantity:");
														sdcard_quantity=Integer.parseInt(venki.readLine());
														tot_sd=sdcard_quantity*99;
														System.out.println("\nSd Card Added!");
												break;
											    case 6: System.out.println("\nEnter the Quantity:");
														sdcard_quantity=Integer.parseInt(venki.readLine());
														tot_sd=sdcard_quantity*155;
														System.out.println("\nSd Card Added!");
												break;
												default:System.out.println("\nINVALID CHOICE!");
											}
									break;
									case 3: System.out.println("\nChoose the Brand:\n1.Sony - 125/-\n2.Transcend - 145/-\n3.SanDisk - 130/-\n4.Hp - 110/-\n5.Moser Baer - 99/-\n6.Strontium - 155/-");
											 sd_company_choice=Integer.parseInt(venki.readLine());
											 switch(sd_company_choice)
											{
											    case 1: System.out.println("\nEnter the Quantity:");
														sdcard_quantity=Integer.parseInt(venki.readLine());
														tot_sd=sdcard_quantity*225;
														System.out.println("\nSd Card Added!");
												break;
											    case 2: System.out.println("\nEnter the Quantity:");
														sdcard_quantity=Integer.parseInt(venki.readLine());
														tot_sd=sdcard_quantity*245;
														System.out.println("\nSd Card Added!");
												break;
											    case 3: System.out.println("\nEnter the Quantity:");
														sdcard_quantity=Integer.parseInt(venki.readLine());
														tot_sd=sdcard_quantity*230;
														System.out.println("\nSd Card Added!");
												break;
											    case 4: System.out.println("\nEnter the Quantity:");
														sdcard_quantity=Integer.parseInt(venki.readLine());
														tot_sd=sdcard_quantity*210;
														System.out.println("\nSd Card Added!");
												break;
											    case 5: System.out.println("\nEnter the Quantity:");
														sdcard_quantity=Integer.parseInt(venki.readLine());
														tot_sd=sdcard_quantity*199;
														System.out.println("\nSd Card Added!");
												break;
											    case 6: System.out.println("\nEnter the Quantity:");
														sdcard_quantity=Integer.parseInt(venki.readLine());
														tot_sd=sdcard_quantity*255;
														System.out.println("\nSd Card Added!");
												break;
												default:System.out.println("\nINVALID CHOICE!");
											}
									break; 
									case 4:  System.out.println("\nChoose the Brand:\n1.Sony - 325/-\n2.Transcend - 345/-\n3.SanDisk - 330/-\n4.Hp - 310/-\n5.Moser Baer - 299/-\n6.Strontium - 355/-");
											 sd_company_choice=Integer.parseInt(venki.readLine());
											 switch(sd_company_choice)
											{
											    case 1: System.out.println("\nEnter the Quantity:");
														sdcard_quantity=Integer.parseInt(venki.readLine());
														tot_sd=sdcard_quantity*325;
														System.out.println("\nSd Card Added!");
												break;
											    case 2: System.out.println("\nEnter the Quantity:");
														sdcard_quantity=Integer.parseInt(venki.readLine());
														tot_sd=sdcard_quantity*345;
														System.out.println("\nSd Card Added!");
												break;
											    case 3: System.out.println("\nEnter the Quantity:");
														sdcard_quantity=Integer.parseInt(venki.readLine());
														tot_sd=sdcard_quantity*330;
														System.out.println("\nSd Card Added!");
												break;
											    case 4: System.out.println("\nEnter the Quantity:");
														sdcard_quantity=Integer.parseInt(venki.readLine());
														tot_sd=sdcard_quantity*310;
														System.out.println("\nSd Card Added!");
												break;
											    case 5: System.out.println("\nEnter the Quantity:");
														sdcard_quantity=Integer.parseInt(venki.readLine());
														tot_sd=sdcard_quantity*299;
														System.out.println("\nSd Card Added!");
												break;
											    case 6: System.out.println("\nEnter the Quantity:");
														sdcard_quantity=Integer.parseInt(venki.readLine());
														tot_sd=sdcard_quantity*355;
														System.out.println("\nSd Card Added!");
												break;
												default:System.out.println("\nINVALID CHOICE!");
											}
									break;
									case 5:  System.out.println("\nChoose the Brand:\n1.Sony - 425/-\n2.Transcend - 545/-\n3.SanDisk - 530/-\n4.Hp - 510/-\n5.Moser Baer - 599/-\n6.Strontium - 555/-");
											 sd_company_choice=Integer.parseInt(venki.readLine());
											 switch(sd_company_choice)
											{
											    case 1: System.out.println("\nEnter the Quantity:");
														sdcard_quantity=Integer.parseInt(venki.readLine());
														tot_sd=sdcard_quantity*125;
														System.out.println("\nSd Card Added!");
												break;
											    case 2: System.out.println("\nEnter the Quantity:");
														sdcard_quantity=Integer.parseInt(venki.readLine());
														tot_sd=sdcard_quantity*145;
														System.out.println("\nSd Card Added!");
												break;
											    case 3: System.out.println("\nEnter the Quantity:");
														sdcard_quantity=Integer.parseInt(vewnki.readLine());
														tot_sd=sdcard_quantity*130;
														System.out.println("\nSd Card Added!");
												break;
											    case 4: System.out.println("\nEnter the Quantity:");
														sdcard_quantity=Integer.parseInt(vewnki.readLine());
														tot_sd=sdcard_quantity*110;
														System.out.println("\nSd Card Added!");
												break;
											    case 5: System.out.println("\nEnter the Quantity:");
														sdcard_quantity=Integer.parseInt(vewnki.readLine());
														tot_sd=sdcard_quantity*99;
														System.out.println("\nSd Card Added!");
												break;
											    case 6: System.out.println("\nEnter the Quantity:");
														sdcard_quantity=Integer.parseInt(vewnki.readLine());
														tot_sd=sdcard_quantity*155;
														System.out.println("\nSd Card Added!");
												break;
												default:System.out.println("\nINVALID CHOICE!");
											}
									break;
									case 6:  System.out.println("\nChoose the Brand:\n1.Sony - 725/-\n2.Transcend - 745/-\n3.SanDisk - 730/-\n4.Hp - 710/-\n5.Moser Baer - 799/-\n6.Strontium - 755/-");
											 sd_company_choice=Integer.parseInt(venki.readLine());
											 switch(sd_company_choice)
											{
											    case 1: System.out.println("\nEnter the Quantity:");
														sdcard_quantity=Integer.parseInt(vewnki.readLine());
														tot_sd=sdcard_quantity*725;
														System.out.println("\nSd Card Added!");
												break;
											    case 2: System.out.println("\nEnter the Quantity:");
														sdcard_quantity=Integer.parseInt(vewnki.readLine());
														tot_sd=sdcard_quantity*745;
														System.out.println("\nSd Card Added!");
												break;
											    case 3: System.out.println("\nEnter the Quantity:");
														sdcard_quantity=Integer.parseInt(vewnki.readLine());
														tot_sd=sdcard_quantity*730;
														System.out.println("\nSd Card Added!");
												break;
											    case 4: System.out.println("\nEnter the Quantity:");
														sdcard_quantity=Integer.parseInt(vewnki.readLine());
														tot_sd=sdcard_quantity*710;
														System.out.println("\nSd Card Added!");
												break;
											    case 5: System.out.println("\nEnter the Quantity:");
														sdcard_quantity=Integer.parseInt(vewnki.readLine());
														tot_sd=sdcard_quantity*699;
														System.out.println("\nSd Card Added!");
												break;
											    case 6: System.out.println("\nEnter the Quantity:");
														sdcard_quantity=Integer.parseInt(vewnki.readLine());
														tot_sd=sdcard_quantity*755;
														System.out.println("\nSd Card Added!");
												break;
												default:System.out.println("\nINVALID CHOICE!");
											}
									break;
									default: System.out.println("\nINVALID CHOICE!");
								 }
						break;
				tot_sdcard+=tot_sd;
						case 13: System.out.println("\nChoose the Brand of your Camera: \n1.Kodak \n2.Nikon \n3. Panasonic \n4.Samsung \n5. Sony \n6. Canon");
								 int camera=Integer.parseInt(venki.readLine());
								 switch(camera)
								 {
									case 1: System.out.println("\nChoose the Type of camera you wish to buy: \n1.Kodak EasyShare Max ; 12 MegaPixels\tPrice : 14,000/-\n2.Kodak EasyShare Touch m5370 ; 14 MegaPixels\tPrice : 10,000\n3.Kodak EasyShare Mini ; 8 MegaPixels\tPrice : 6,200");
											camera_company=Integer.parseInt(venki.readLine());
											switch(camera_company)
											{
												case 1: System.out.println("\nEnter the quantity:");
														camera_quantity=Integer.parseInt(venki.readLine());
														tot_cam=camera_quantity*14000;
														System.out.println("\nCamera Added!");
												break;
												case 2: System.out.println("\nEnter the quantity:");
														camera_quantity=Integer.parseInt(venki.readLine());
														tot_cam=camera_quantity*10000;
														System.out.println("\nCamera Added!");
												break;
												case 3: System.out.println("\nEnter the quantity:");
														camera_quantity=Integer.parseInt(venki.readLine());
														totcam=camera_quantity*6200;
														System.out.println("\nCamera Added!");
												break;
												default: System.out.println("\nINVALID CHOICE!");
											}
									break;
									case 2: System.out.println("\nChoose the type of camera you wish to buy:\n1.Nikon D3200 ; 24.2 MegaPixel(s)\tPrice : 21,420/-\n2.Nikon D5200 ; 24.1MegaPixel(s)\tPrice : 27,199/-\n3.Nikon Coolpix 5700 ; 16.5 MegaPixel(s)\tPrice : 8,099/-\n4.Nikon Coolpix P610 ; 20.1MegaPixel(s)\tPrice : 17,748/-\n5.Nikon Coolpix S6500 ; 16 MegaPixel(s)\tPrice : 9,999/-");
											camera_company=Integer.parseInt(venki.readLine());
											switch(camera_company)
											{
												case 1: System.out.println("\nEnter The quantity:");
														camera_quantity=Integer.parseInt(venki.readLine());
														tot_cam=camera_quantity*21420;
														System.out.println("\nCamera Added!");
												break;
												case 2: System.out.println("\nEnter The quantity:");
														camera_quantity=Integer.parseInt(venki.readLine());
														tot_cam=camera_quantity*27199;
														System.out.println("\nCamera Added!");
												break;
												case 3: System.out.println("\nEnter The quantity:");
														camera_quantity=Integer.parseInt(venki.readLine());
														tot_cam=camera_quantity*8099;
														System.out.println("\nCamera Added!");
												break;
												case 4: System.out.println("\nEnter The quantity:");
														camera_quantity=Integer.parseInt(venki.readLine());
														tot_cam=camera_quantity*17748;
														System.out.println("\nCamera Added!");
												break;
												case 5: System.out.println("\nEnter The quantity:");
														camera_quantity=Integer.parseInt(venki.readLine());
														tot_cam=camera_quantity*9999;
														System.out.println("\nCamera Added!");
												break;
												default: System.out.println("\nINVALID CHOICE!");
											}
									break;
									case 3: System.out.println("\nEnter the Type of camera you wish to buy:\n1.Panasonic Lumix ; 20 MegaPixels ; Price : 14,000/-\n2.Panasonic Lumix DMC-LS5 ; 14.1 MegaPixels ; Price : 4,498/-\n3.Panasonic Lumix GH4K ; 30.9 MegaPixles ; Price : 1,35,000/-\n4.Panasonic AG-AC 160 ; 101.23 MegaPixels ; Price : 2,39,000/-");
											camera_company=Integer.parseInt(venki.readLine());
											switch(camera_company)
											{
												case 1: System.out.println("\nEnter the quantity:");
														camera_quantity=Integer.parseInt(venki.readLine());
														tot_cam=camera_quantity*14000;
														System.out.println("\nINVALID CHOICE!");
												break;
												case 2: System.out.println("\nEnter the quantity:");
														camera_quantity=Integer.parseInt(venki.readLine());
														tot_cam=camera_quantity*4498;
														System.out.println("\nINVALID CHOICE!");
												break;
												case 3: System.out.println("\nEnter the quantity:");
														camera_quantity=Integer.parseInt(venki.readLine());
														tot_cam=camera_quantity*135000;
														System.out.println("\nINVALID CHOICE!");
												break;
												case 4: System.out.println("\nEnter the quantity:");
														camera_quantity=Integer.parseInt(venki.readLine());
														tot_cam=camera_quantity*239000;
														System.out.println("\nINVALID CHOICE!");
												break;
												default: System.out.println("\nINVALID CHOICE!");
											}
									break;
									case 4: System.out.println("\nEnter the type of camera you wish to buy:\n1.Samsung Galaxy ; 16.3 MegaPixels ; Price : 24,999/-\n3.Samsung PL120 Point ; 14.2 MegaPixels ; Price : 5000/-\n3.Samsung WB5OF ; 15.1 MegaPixels ; Price : 14,748/-\n4.ES91 ; 14.2 MegaPixels ; Price : 4,250/-\n5.Samsung Smart ; 20.9 MegaPixels ; Price : 13,249/-\n6.Samsung ST72 Point & Shoot ; 21.9 MegaPixels ; Price : 6,499/-");
											camera_company=Integer.parseInt(venki.readLine());
											switch(camera_company)
											{
												case 1: System.out.println("\nEnter the quantity:");
														camera_quantity=Integer.parseInt(venki.readLine());
														tot_cam=camera_quantity*24999;
														System.out.println("\nCamera Added!");
												break;
												case 2: System.out.println("\nEnter the quantity:");
														camera_quantity=Integer.parseInt(venki.readLine());
														tot_cam=camera_quantity*5000;
														System.out.println("\nCamera Added!");
												break;
												case 3: System.out.println("\nEnter the quantity:");
														camera_quantity=Integer.parseInt(venki.readLine());
														tot_cam=camera_quantity*14748;
														System.out.println("\nCamera Added!");
												break;
												case 4: System.out.println("\nEnter the quantity:");
														camera_quantity=Integer.parseInt(venki.readLine());
														tot_cam=camera_quantity*4250;
														System.out.println("\nCamera Added!");
												break;
												case 5: System.out.println("\nEnter the quantity:");
														camera_quantity=Integer.parseInt(venki.readLine());
														tot_cam=camera_quantity*13244;
														System.out.println("\nCamera Added!");
												break;
												case 6: System.out.println("\nEnter the quantity:");
														camera_quantity=Integer.parseInt(venki.readLine());
														tot_cam=camera_quantity*6499;
														System.out.println("\nCamera Added!");
												break;
												default: System.out.println("\nINVALID CHOICE");
											}
									break;
									case 5: System.out.println("\nChoose the Type of Camera you wish to buy:\n1.Sony CyberShot ; 20 MegaPixels ; Price : 6,662/-\n2.Sony CyberShot DSC-W810 ; 14 MegaPixels ; Price : 5,563/-\n3.Sony CyberShot DSC-WX350 ; 16 MegaPixels ; Price : 13,949/-\n4.Sony CyberShot WX80 ; 8 MegaPixels ; Price : 9000/-\n5.Sony CyberShot - H200 ; 20.1 MegaPixels ; Price : 11,000/-");
											camera_company=Integer.parseInt(venki.readLine());
											switch(camera_company)
											{
												case 1: System.out.println("\nEnter the quantity:");
														camera_quantity=Integer.parseInt(venki.readLine());
														tot_cam=camera_quantity*6662;
														System.out.println("\nCamera Added!");
												break;
												case 2: System.out.println("\nEnter the quantity:");
														camera_quantity=Integer.parseInt(venki.readLine());
														tot_cam=camera_quantity*5563;
														System.out.println("\nCamera Added!");
												break;
												case 3: System.out.println("\nEnter the quantity:");
														camera_quantity=Integer.parseInt(venki.readLine());
														tot_cam=camera_quantity*13949;
														System.out.println("\nCamera Added!");
												break;
												case 4: System.out.println("\nEnter the quantity:");
														camera_quantity=Integer.parseInt(venki.readLine());
														tot_cam=camera_quantity*9000;
														System.out.println("\nCamera Added!");
												break;
												case 5: System.out.println("\nEnter the quantity:");
														camera_quantity=Integer.parseInt(venki.readLine());
														tot_cam=camera_quantity*11000;
														System.out.println("\nCamera Added!");
												break;
												default: System.out.println("\nCamera Added!");
											}
									break;
									case 6: System.out.println("\nChooose the type of Camera you wish to buy:\n1.Canon PowerShot SX410 ; 10 MegaPixels ; Price : 10,300/-\n2.Canon PowerShot A810 ; 16 MegaPixels ; Price : 3925/-\n3.Canon EOS ; 59.1 MegaPixels 1,12,000/-\n4.Canon IXUS 160 ; 9.2 MeagPixels ; Price : 4700/-\n5.Canon Digital IUS 510 ; 14.1 MegaPixels ; Price : 10,440/-");
											camera_company=Integer.parseInt(venki.readLine());
											switch(camera_company)
											{
												case 1: System.out.println("\nEnter the quantity:");
														camera_quantity=Integer.parseInt(venki.readLine());
														tot_cam=camera_quantity*10300;
														System.out.println("\nCamera Added!");
												break;
												case 2: System.out.println("\nEnter the quantity:");
														camera_quantity=Integer.parseInt(venki.readLine());
														tot_cam=camera_quantity*3925;
														System.out.println("\nCamera Added!");
												break;
												case 3: System.out.println("\nEnter the quantity:");
														camera_quantity=Integer.parseInt(venki.readLine());
														tot_cam=camera_quantity*26900;
														System.out.println("\nCamera Added!");
												break;
												case 4: System.out.println("\nEnter the quantity:");
														camera_quantity=Integer.parseInt(venki.readLine());
														tot_cam=camera_quantity*4700;
														System.out.println("\nCamera Added!");
												break;
												case 5: System.out.println("\nEnter the quantity:");
														camera_quantity=Integer.parseInt(venki.readLine());
														tot_cam=camera_quantity*10440;
														System.out.println("\nCamera Added!");
												break;
												default: System.out.println("\nCamera Added!");
											}
									break;
								 }
					tot_camera+=tot_cam;
						case 14: System.out.println("\nEnter the Quantity of CD's You wish to Buy -\n1.Each Will Cause you 20/-");
								 cd_quantity=Integer.parseInt(venki.readLine());
								 tot_CD=cd_quantity*20;
						break;
				tot_cd+=tot_CD;
						case 15: System.out.println("\nEnter the Quantity of CD's You wish to Buy -\n1.Each Will Cause you 20/-");
								 dvd_quantity=Integer.parseInt(venki.readLine());
								 tot_Dvd=dvd_quantity*20;
						break;
				tot_dvd+=tot_Dvd;
						case 16: System.out.println("\nChoose the AntiVirus you want to Buy:\n1.Net Protector AntiVirus - 500/-\n2.Bit Defender AntiVirus - 450/-\n3.Norton - 525/-\n4.Quick Heal - 1200/-\n5.McAfee AntiVirus - 600/-\n6.KasperSky - 899/-\n7.Avast - 300/-\n8.AVG AntiVirus - 399/-\n9.360 Total Security AntiVirus - 510/-");
								 int antivirus=Integer.parseInt(venki.readLine());
								 switch(antivirus)
								 {
									case 1: System.out.println("\nEnter the Quantity:");
											anti_quantity=Integer.parseInt(venki.readLine());
											tot_anti=anti_quantity*500;
											System.out.println("\nAntiVirus Added!");
									break;
									case 2: System.out.println("\nEnter the Quantity:");
											anti_quantity=Integer.parseInt(venki.readLine());
											tot_anti=anti_quantity*450;
											System.out.println("\nAntiVirus Added!");
									break;
									case 3: System.out.println("\nEnter the Quantity:");
											anti_quantity=Integer.parseInt(venki.readLine());
											tot_anti=anti_quantity*500;
											System.out.println("\nAntiVirus Added!");
									break;
									case 4: System.out.println("\nEnter the Quantity:");
											anti_quantity=Integer.parseInt(venki.readLine());
											tot_anti=anti_quantity*1200;
											System.out.println("\nAntiVirus Added!");
									break;
									case 5: System.out.println("\nEnter the Quantity:");
											anti_quantity=Integer.parseInt(venki.readLine());
											tot_anti=anti_quantity*600;
											System.out.println("\nAntiVirus Added!");
									break;
									case 6: System.out.println("\nEnter the Quantity:");
											anti_quantity=Integer.parseInt(venki.readLine());
											tot_anti=anti_quantity*891;
											System.out.println("\nAntiVirus Added!");
									break;
									case 7: System.out.println("\nEnter the Quantity:");
											anti_quantity=Integer.parseInt(venki.readLine());
											tot_anti=anti_quantity*300;
											System.out.println("\nAntiVirus Added!");
									break;
									case 8: System.out.println("\nEnter the Quantity:");
											anti_quantity=Integer.parseInt(venki.readLine());
											tot_anti=anti_quantity*399;
											System.out.println("\nAntiVirus Added!");
									break;
									case 9: System.out.println("\nEnter the Quantity:");
											anti_quantity=Integer.parseInt(venki.readLine());
											tot_anti=anti_quantity*510;
											System.out.println("\nAntiVirus Added!");
									break;
									default:System.out.println("\nINVALID CHOICE!");
								 }
					}	break;
				tot_antivirus+=tot_anti;
				System.out.println("\nTO Continue Buying IT Items Press 1 or 0 To EXIT from this Section!");
				shop_it=Integer.parseInt(venki.readLine());
				}while(shop_it!=0);                           
			}                                  
		tot_it+=tot_processor+tot_graphics+tot_motherboard+tot_mouse+tot_keyboard+tot_speaker+tot_headphone+tot_earphone+tot_ups+tot_pendrive+tot_sdcard+tot_camera+tot_cd+tot_dvd+tot_antivirus;
			
			else if(choice_gen==3)			//For eatables
			{
				do
				{
					System.out.println("\nNOTE : Minimum quantity of VEGGIES or FRUITS must be 1/Kg!!!");
					System.out.println("\nChoose the Category Food:\n1.Vegetables\n2.Fruits\n3.Cold Drinks\n4.Juices\n5.Dairy Products\n6.Dry Fruits");
					choice_veg=Integer.parseInt(venki.readLine());
					switch(choice_eat)
					{
						case 1: System.out.println("\nChoose the Vegetable(s) you want to buy:\n1.Onion(s) - 60/Kg\n2.Tomato(s) - 25/Kg\n3.Potatoes - 20/Kg\n4.Ginger - 10/Kg\n5.Coriander -5/per Bunch\n6.Cauliflower - 15/-\n7.Cabbage - 10/-\n8.BeetRoot - 20/per 4 pieces\n9.Carrot - 30/Kg\n10.Cucumber - 20/Kg\n11.Spinach - 40/Kg\n12.Sprouts - 20/kg\n13.Green Peas - 15/Kg\n14.Rajma - 28/Kg\n15.LadyFinger - 25/Kg\n16.Brinjal - 23/Kg");
								int vegetables=Integer.parseInt(venki.readLine());
								switch(vegetables)
								{
									case 1: System.out.println("\nEnter the quantity:");
											onion_quantity=Integer.parseInt(venki.readLine());
											tot_veg=onion_quantity*60;
											System.out.println("\nVeggie Added!");
									break;
									case 2: System.out.pritnln("\nEnter the quantity:");
											vegetables_quantity=Integer.parseInt(venki.readLine());
											tot_veg=vegetables_quantity*25;
											System.out.println("\nVeggie Added!");
									break;
									case 3: System.out.pritnln("\nEnter the quantity:");
											vegetables_quantity=Integer.parseInt(venki.readLine());
											tot_veg=vegetables_quantity*20;
											System.out.println("\nVeggie Added!");
									break;
									case 4: System.out.pritnln("\nEnter the quantity:");
											vegetables_quantity=Integer.parseInt(venki.readLine());
											tot_veg=vegetables_quantity*10;
											System.out.println("\nVeggie Added!");
									break;
									case 5: System.out.pritnln("\nEnter the quantity:");
											vegetables_quantity=Integer.parseInt(venki.readLine());
											tot_veg=vegetables_quantity*5;
											System.out.println("\nVeggie Added!");
									break;
									case 6: System.out.pritnln("\nEnter the quantity:");
											vegetables_quantity=Integer.parseInt(venki.readLine());
											tot_veg=vegetables_quantity*15;
											System.out.println("\nVeggie Added!");
									break;
									case 7: System.out.pritnln("\nEnter the quantity:");
											vegetables_quantity=Integer.parseInt(venki.readLine());
											tot_veg=vegetables_quantity*10;
											System.out.println("\nVeggie Added!");
									break;
									case 8: System.out.pritnln("\nEnter the quantity:");
											vegetables_quantity=Integer.parseInt(venki.readLine());
											tot_veg=vegetables_quantity*20;
											System.out.println("\nVeggie Added!");
									break;
									case 9: System.out.pritnln("\nEnter the quantity:");
											vegetables_quantity=Integer.parseInt(venki.readLine());
											tot_veg=vegetables_quantity*30;
											System.out.println("\nVeggie Added!");
									break;
									case 10: System.out.pritnln("\nEnter the quantity:");
											vegetables_quantity=Integer.parseInt(venki.readLine());
											tot_veg=vegetables_quantity*20;
											System.out.println("\nVeggie Added!");
									break;
									case 11: System.out.pritnln("\nEnter the quantity:");
											vegetables_quantity=Integer.parseInt(venki.readLine());
											tot_veg=vegetables_quantity*40;
											System.out.println("\nVeggie Added!");
									break;
									case 12: System.out.pritnln("\nEnter the quantity:");
											vegetables_quantity=Integer.parseInt(venki.readLine());
											tot_veg=vegetables_quantity*20;
											System.out.println("\nVeggie Added!");
									break;
									case 13: System.out.pritnln("\nEnter the quantity:");
											vegetables_quantity=Integer.parseInt(venki.readLine());
											tot_veg=vegetables_quantity*15;
											System.out.println("\nVeggie Added!");
									break;
									case 14: System.out.pritnln("\nEnter the quantity:");
											vegetables_quantity=Integer.parseInt(venki.readLine());
											tot_veg=vegetables_quantity*28;
											System.out.println("\nVeggie Added!");
									break;
									case 15: System.out.pritnln("\nEnter the quantity:");
											vegetables_quantity=Integer.parseInt(venki.readLine());
											tot_veg=vegetables_quantity*25;
											System.out.println("\nVeggie Added!");
									break;
									case 16: System.out.pritnln("\nEnter the quantity:");
											vegetables_quantity=Integer.parseInt(venki.readLine());
											tot_veg=vegetables_quantity*23;
											System.out.println("\nVeggie Added!");
									break;
									default: System.out.println("\nINVALID CHOICE!");
								}
						break;
				tot_vegetables+=tot_veg;
						case 2: System.out.println("\n1.Apple - 80/Kg\n2.Mango - 250/Kg\n3.CusturdApple - 55/Kg\n4.Grapes - 75/Kg\n5.Jack Fruit - 35/-\n6.Watermelon - 50/-\n7.Papaya - 35/-\n8.Banana - 20/Kg-\n9.Orange - 90/Kg\n10.SweetLime - 85\Kg\n11.BlackBerry - 30/Kg\n12.Kiwi - 120/Kg\n13.Mulberry - 95/Kg-\n14.Guava - 45/Kg\n15.CranBerry - 100/Kg\n16.Litchi -55/Kg\n17.Cherry 20/kg\n18.Strawberry - 65/Kg");
								int fruits=Integer.parseInt(venki.readLine());
								switch(fruits)
								{
									case 1: System.out.println("\nEnter the Quantity:");
											fruit_quantity=Integer.parseInt(venki.readLine());
											tot_fru=fruit_quantity*80;
											System.out.println("\nFruit Added!");
									break;
									case 2: System.out.println("\nEnter the Quantity:");
											fruit_quantity=Integer.parseInt(venki.readLine());
											tot_fru=fruit_quantity*250;
											System.out.println("\nFruit Added!");
									break;
									case 3: System.out.println("\nEnter the Quantity:");
											fruit_quantity=Integer.parseInt(venki.readLine());
											tot_fru=fruit_quantity*55;
											System.out.println("\nFruit Added!");
									break;
									case 4: System.out.println("\nEnter the Quantity:");
											fruit_quantity=Integer.parseInt(venki.readLine());
											tot_fru=fruit_quantity*75;
											System.out.println("\nFruit Added!");
									break;
									case 5: System.out.println("\nEnter the Quantity:");
											fruit_quantity=Integer.parseInt(venki.readLine());
											tot_fru=fruit_quantity*35;
											System.out.println("\nFruit Added!");
									break;
									case 6: System.out.println("\nEnter the Quantity:");
											fruit_quantity=Integer.parseInt(venki.readLine());
											tot_fru=fruit_quantity*50;
											System.out.println("\nFruit Added!");
									break;
									case 7: System.out.println("\nEnter the Quantity:");
											fruit_quantity=Integer.parseInt(venki.readLine());
											tot_fru=fruit_quantity*35;
											System.out.println("\nFruit Added!");
									break;
									case 8: System.out.println("\nEnter the Quantity:");
											fruit_quantity=Integer.parseInt(venki.readLine());
											tot_fru=fruit_quantity*20;
											System.out.println("\nFruit Added!");
									break;
									case 9: System.out.println("\nEnter the Quantity:");
											fruit_quantity=Integer.parseInt(venki.readLine());
											tot_fru=fruit_quantity*90;
											System.out.println("\nFruit Added!");
									break;
									case 10: System.out.println("\nEnter the Quantity:");
											fruit_quantity=Integer.parseInt(venki.readLine());
											tot_fru=fruit_quantity*85;
											System.out.println("\nFruit Added!");
									break;
									case 11: System.out.println("\nEnter the Quantity:");
											fruit_quantity=Integer.parseInt(venki.readLine());
											tot_fru=fruit_quantity*30;
											System.out.println("\nFruit Added!");
									break;
									case 12: System.out.println("\nEnter the Quantity:");
											fruit_quantity=Integer.parseInt(venki.readLine());
											tot_fru=fruit_quantity*120;
											System.out.println("\nFruit Added!");
									break;
									case 13: System.out.println("\nEnter the Quantity:");
											fruit_quantity=Integer.parseInt(venki.readLine());
											tot_fru=fruit_quantity*95;
											System.out.println("\nFruit Added!");
									break;
									case 14: System.out.println("\nEnter the Quantity:");
											fruit_quantity=Integer.parseInt(venki.readLine());
											tot_fru=fruit_quantity*45;
											System.out.println("\nFruit Added!");
									break;
									case 15: System.out.println("\nEnter the Quantity:");
											fruit_quantity=Integer.parseInt(venki.readLine());
											tot_fru=fruit_quantity*100;
											System.out.println("\nFruit Added!");
									break;
									case 16: System.out.println("\nEnter the Quantity:");
											fruit_quantity=Integer.parseInt(venki.readLine());
											tot_fru=fruit_quantity*55;
											System.out.println("\nFruit Added!");
									break;
									case 17: System.out.println("\nEnter the Quantity:");
											fruit_quantity=Integer.parseInt(venki.readLine());
											tot_fru=fruit_quantity*20;
											System.out.println("\nFruit Added!");
									break;
									case 18: System.out.println("\nEnter the Quantity:");
											fruit_quantity=Integer.parseInt(venki.readLine());
											tot_fru=fruit_quantity*65;
											System.out.println("\nFruit Added!");
									break;
									default: System.out.pritnln("\nINVALID CHOICE!");
								}
						break;
				tot_fruits+=tot_fru;
						case 3: System.out.println("\n1.Slice\n2.Maza\n3.Miranda\n4.Limca\n5.Sprite\n6.7Up\n8.Mountain Dew\n8.Frootie\n9.Fanta\n10.Cocacola\n11.Pepsi\n12.Thumps Up");
								int cold_drinks=Integer.parseInt(venki.readLine());
								switch(cold_drinks)
								{
									case 1: System.out.println("\nChoose the Quanity:\n1.550ml - 28/-\n2.1Litre -50/-\n3.2Litre -85/-");
											cold_lit=Integer.parseInt(venki.readLine());
											switch(cold_lit)
											{
												case 1: System.out.println("\nEnter the Number of Bottle(s) you want to Buy:");
														coldrinks_quantity=Integer.parseInt(venki.readLine());
														tot_cold=coldrinks_quantity*28;
														System.out.pritnln("\nINVALID CHOICE!");
												break;
												case 2: System.out.println("\nEnter the Number of Bottle(s) you want to Buy:");
														coldrinks_quantity=Integer.parseInt(venki.readLine());
														tot_cold=coldrinks_quantity*50;
														System.out.pritnln("\nINVALID CHOICE!");
												break;
												case 3: System.out.println("\nEnter the Number of Bottle(s) you want to Buy:");
														coldrinks_quantity=Integer.parseInt(venki.readLine());
														tot_cold=coldrinks_quantity*85;
														System.out.pritnln("\nINVALID CHOICE!");
												break;
												default:System.out.println("\nINVALID CHOICE!");
											}
									break;
									case 2: System.out.println("\nChoose the Quanity:\n1.550ml - 28/-\n2.1Litre -50/-\n3.2Litre -85/-");
											cold_lit=Integer.parseInt(venki.readLine());
											switch(cold_lit)
											{
												case 1: System.out.println("\nEnter the Number of Bottle(s) you want to Buy:");
														coldrinks_quantity=Integer.parseInt(venki.readLine());
														tot_cold=coldrinks_quantity*28;
														System.out.pritnln("\nINVALID CHOICE!");
												break;
												case 2: System.out.println("\nEnter the Number of Bottle(s) you want to Buy:");
														coldrinks_quantity=Integer.parseInt(venki.readLine());
														tot_cold=coldrinks_quantity*50;
														System.out.pritnln("\nINVALID CHOICE!");
												break;
												case 3: System.out.println("\nEnter the Number of Bottle(s) you want to Buy:");
														coldrinks_quantity=Integer.parseInt(venki.readLine());
														tot_cold=coldrinks_quantity*85;
														System.out.pritnln("\nINVALID CHOICE!");
												break;
												default:System.out.println("\nINVALID CHOICE!");
											}
									break;
									case 3: System.out.println("\nChoose the Quanity:\n1.550ml - 28/-\n2.1Litre -50/-\n3.2Litre -85/-");
											cold_lit=Integer.parseInt(venki.readLine());
											switch(cold_lit)
											{
												case 1: System.out.println("\nEnter the Number of Bottle(s) you want to Buy:");
														coldrinks_quantity=Integer.parseInt(venki.readLine());
														tot_cold=coldrinks_quantity*28;
														System.out.pritnln("\nINVALID CHOICE!");
												break;
												case 2: System.out.println("\nEnter the Number of Bottle(s) you want to Buy:");
														coldrinks_quantity=Integer.parseInt(venki.readLine());
														tot_cold=coldrinks_quantity*50;
														System.out.pritnln("\nINVALID CHOICE!");
												break;
												case 3: System.out.println("\nEnter the Number of Bottle(s) you want to Buy:");
														coldrinks_quantity=Integer.parseInt(venki.readLine());
														tot_cold=coldrinks_quantity*85;
														System.out.pritnln("\nINVALID CHOICE!");
												break;
												default:System.out.println("\nINVALID CHOICE!");
											}
									break;
									case 4: System.out.println("\nChoose the Quanity:\n1.550ml - 28/-\n2.1Litre -50/-\n3.2Litre -85/-");
											cold_lit=Integer.parseInt(venki.readLine());
											switch(cold_lit)
											{
												case 1: System.out.println("\nEnter the Number of Bottle(s) you want to Buy:");
														coldrinks_quantity=Integer.parseInt(venki.readLine());
														tot_cold=coldrinks_quantity*28;
														System.out.pritnln("\nINVALID CHOICE!");
												break;
												case 2: System.out.println("\nEnter the Number of Bottle(s) you want to Buy:");
														coldrinks_quantity=Integer.parseInt(venki.readLine());
														tot_cold=coldrinks_quantity*50;
														System.out.pritnln("\nINVALID CHOICE!");
												break;
												case 3: System.out.println("\nEnter the Number of Bottle(s) you want to Buy:");
														coldrinks_quantity=Integer.parseInt(venki.readLine());
														tot_cold=coldrinks_quantity*85;
														System.out.pritnln("\nINVALID CHOICE!");
												break;
												default:System.out.println("\nINVALID CHOICE!");
											}
									break;
									case 5: System.out.println("\nChoose the Quanity:\n1.550ml - 28/-\n2.1Litre -50/-\n3.2Litre -85/-");
											cold_lit=Integer.parseInt(venki.readLine());
											switch(cold_lit)
											{
												case 1: System.out.println("\nEnter the Number of Bottle(s) you want to Buy:");
														coldrinks_quantity=Integer.parseInt(venki.readLine());
														tot_cold=coldrinks_quantity*28;
														System.out.pritnln("\nINVALID CHOICE!");
												break;
												case 2: System.out.println("\nEnter the Number of Bottle(s) you want to Buy:");
														coldrinks_quantity=Integer.parseInt(venki.readLine());
														tot_cold=coldrinks_quantity*50;
														System.out.pritnln("\nINVALID CHOICE!");
												break;
												case 3: System.out.println("\nEnter the Number of Bottle(s) you want to Buy:");
														coldrinks_quantity=Integer.parseInt(venki.readLine());
														tot_cold=coldrinks_quantity*85;
														System.out.pritnln("\nINVALID CHOICE!");
												break;
												default:System.out.println("\nINVALID CHOICE!");
											}
									break;
									case 6: System.out.println("\nChoose the Quanity:\n1.550ml - 28/-\n2.1Litre -50/-\n3.2Litre -85/-");
											cold_lit=Integer.parseInt(venki.readLine());
											switch(cold_lit)
											{
												case 1: System.out.println("\nEnter the Number of Bottle(s) you want to Buy:");
														coldrinks_quantity=Integer.parseInt(venki.readLine());
														tot_cold=coldrinks_quantity*28;
														System.out.pritnln("\nINVALID CHOICE!");
												break;
												case 2: System.out.println("\nEnter the Number of Bottle(s) you want to Buy:");
														coldrinks_quantity=Integer.parseInt(venki.readLine());
														tot_cold=coldrinks_quantity*50;
														System.out.pritnln("\nINVALID CHOICE!");
												break;
												case 3: System.out.println("\nEnter the Number of Bottle(s) you want to Buy:");
														coldrinks_quantity=Integer.parseInt(venki.readLine());
														tot_cold=coldrinks_quantity*85;
														System.out.pritnln("\nINVALID CHOICE!");
												break;
												default:System.out.println("\nINVALID CHOICE!");
											}
									break;
									case 7: System.out.println("\nChoose the Quanity:\n1.550ml - 28/-\n2.1Litre -50/-\n3.2Litre -85/-");
											cold_lit=Integer.parseInt(venki.readLine());
											switch(cold_lit)
											{
												case 1: System.out.println("\nEnter the Number of Bottle(s) you want to Buy:");
														coldrinks_quantity=Integer.parseInt(venki.readLine());
														tot_cold=coldrinks_quantity*28;
														System.out.pritnln("\nINVALID CHOICE!");
												break;
												case 2: System.out.println("\nEnter the Number of Bottle(s) you want to Buy:");
														coldrinks_quantity=Integer.parseInt(venki.readLine());
														tot_cold=coldrinks_quantity*50;
														System.out.pritnln("\nINVALID CHOICE!");
												break;
												case 3: System.out.println("\nEnter the Number of Bottle(s) you want to Buy:");
														coldrinks_quantity=Integer.parseInt(venki.readLine());
														tot_cold=coldrinks_quantity*85;
														System.out.pritnln("\nINVALID CHOICE!");
												break;
												default:System.out.println("\nINVALID CHOICE!");
											}
									break;
									case 7: System.out.println("\nChoose the Quanity:\n1.550ml - 28/-\n2.1Litre -50/-\n3.2Litre -85/-");
											cold_lit=Integer.parseInt(venki.readLine());
											switch(cold_lit)
											{
												case 1: System.out.println("\nEnter the Number of Bottle(s) you want to Buy:");
														coldrinks_quantity=Integer.parseInt(venki.readLine());
														tot_cold=coldrinks_quantity*28;
														System.out.pritnln("\nINVALID CHOICE!");
												break;
												case 2: System.out.println("\nEnter the Number of Bottle(s) you want to Buy:");
														coldrinks_quantity=Integer.parseInt(venki.readLine());
														tot_cold=coldrinks_quantity*50;
														System.out.pritnln("\nINVALID CHOICE!");
												break;
												case 3: System.out.println("\nEnter the Number of Bottle(s) you want to Buy:");
														coldrinks_quantity=Integer.parseInt(venki.readLine());
														tot_cold=coldrinks_quantity*85;
														System.out.pritnln("\nINVALID CHOICE!");
												break;
												default:System.out.println("\nINVALID CHOICE!");
											}
									break;
									case 8: System.out.println("\nChoose the Quanity:\n1.550ml - 28/-\n2.1Litre -50/-\n3.2Litre -85/-");
											cold_lit=Integer.parseInt(venki.readLine());
											switch(cold_lit)
											{
												case 1: System.out.println("\nEnter the Number of Bottle(s) you want to Buy:");
														coldrinks_quantity=Integer.parseInt(venki.readLine());
														tot_cold=coldrinks_quantity*28;
														System.out.pritnln("\nINVALID CHOICE!");
												break;
												case 2: System.out.println("\nEnter the Number of Bottle(s) you want to Buy:");
														coldrinks_quantity=Integer.parseInt(venki.readLine());
														tot_cold=coldrinks_quantity*50;
														System.out.pritnln("\nINVALID CHOICE!");
												break;
												case 3: System.out.println("\nEnter the Number of Bottle(s) you want to Buy:");
														coldrinks_quantity=Integer.parseInt(venki.readLine());
														tot_cold=coldrinks_quantity*85;
														System.out.pritnln("\nINVALID CHOICE!");
												break;
												default:System.out.println("\nINVALID CHOICE!");
											}
									break;
									case 9: System.out.println("\nChoose the Quanity:\n1.550ml - 28/-\n2.1Litre -50/-\n3.2Litre -85/-");
											cold_lit=Integer.parseInt(venki.readLine());
											switch(cold_lit)
											{
												case 1: System.out.println("\nEnter the Number of Bottle(s) you want to Buy:");
														coldrinks_quantity=Integer.parseInt(venki.readLine());
														tot_cold=coldrinks_quantity*28;
														System.out.pritnln("\nINVALID CHOICE!");
												break;
												case 2: System.out.println("\nEnter the Number of Bottle(s) you want to Buy:");
														coldrinks_quantity=Integer.parseInt(venki.readLine());
														tot_cold=coldrinks_quantity*50;
														System.out.pritnln("\nINVALID CHOICE!");
												break;
												case 3: System.out.println("\nEnter the Number of Bottle(s) you want to Buy:");
														coldrinks_quantity=Integer.parseInt(venki.readLine());
														tot_cold=coldrinks_quantity*85;
														System.out.pritnln("\nINVALID CHOICE!");
												break;
												default:System.out.println("\nINVALID CHOICE!");
											}
									break;
									case 10: System.out.println("\nChoose the Quanity:\n1.550ml - 28/-\n2.1Litre -50/-\n3.2Litre -85/-");
											cold_lit=Integer.parseInt(venki.readLine());
											switch(cold_lit)
											{
												case 1: System.out.println("\nEnter the Number of Bottle(s) you want to Buy:");
														coldrinks_quantity=Integer.parseInt(venki.readLine());
														tot_cold=coldrinks_quantity*28;
														System.out.pritnln("\nINVALID CHOICE!");
												break;
												case 2: System.out.println("\nEnter the Number of Bottle(s) you want to Buy:");
														coldrinks_quantity=Integer.parseInt(venki.readLine());
														tot_cold=coldrinks_quantity*50;
														System.out.pritnln("\nINVALID CHOICE!");
												break;
												case 3: System.out.println("\nEnter the Number of Bottle(s) you want to Buy:");
														coldrinks_quantity=Integer.parseInt(venki.readLine());
														tot_cold=coldrinks_quantity*85;
														System.out.pritnln("\nINVALID CHOICE!");
												break;
												default:System.out.println("\nINVALID CHOICE!");
											}
									break;
									case 11: System.out.println("\nChoose the Quanity:\n1.550ml - 28/-\n2.1Litre -50/-\n3.2Litre -85/-");
											cold_lit=Integer.parseInt(venki.readLine());
											switch(cold_lit)
											{
												case 1: System.out.println("\nEnter the Number of Bottle(s) you want to Buy:");
														coldrinks_quantity=Integer.parseInt(venki.readLine());
														tot_cold=coldrinks_quantity*28;
														System.out.pritnln("\nINVALID CHOICE!");
												break;
												case 2: System.out.println("\nEnter the Number of Bottle(s) you want to Buy:");
														coldrinks_quantity=Integer.parseInt(venki.readLine());
														tot_cold=coldrinks_quantity*50;
														System.out.pritnln("\nINVALID CHOICE!");
												break;
												case 3: System.out.println("\nEnter the Number of Bottle(s) you want to Buy:");
														coldrinks_quantity=Integer.parseInt(venki.readLine());
														tot_cold=coldrinks_quantity*85;
														System.out.pritnln("\nINVALID CHOICE!");
												break;
												default:System.out.println("\nINVALID CHOICE!");
											}
									break;
									case 12: System.out.println("\nChoose the Quanity:\n1.550ml - 28/-\n2.1Litre -50/-\n3.2Litre -85/-");
											cold_lit=Integer.parseInt(venki.readLine());
											switch(cold_lit)
											{
												case 1: System.out.println("\nEnter the Number of Bottle(s) you want to Buy:");
														coldrinks_quantity=Integer.parseInt(venki.readLine());
														tot_cold=coldrinks_quantity*28;
														System.out.pritnln("\nINVALID CHOICE!");
												break;
												case 2: System.out.println("\nEnter the Number of Bottle(s) you want to Buy:");
														coldrinks_quantity=Integer.parseInt(venki.readLine());
														tot_cold=coldrinks_quantity*50;
														System.out.pritnln("\nINVALID CHOICE!");
												break;
												case 3: System.out.println("\nEnter the Number of Bottle(s) you want to Buy:");
														coldrinks_quantity=Integer.parseInt(venki.readLine());
														tot_cold=coldrinks_quantity*85;
														System.out.pritnln("\nINVALID CHOICE!");
												break;
												default:System.out.println("\nINVALID CHOICE!");
											}
									break;
									default:System.out.println("\nINVALID CHOICE!");
								}
						break;
				tot_coldrink+=tot_cold;
						case 4: System.out.println("\nChoose the Flavour of your Juice:\n1.Mango Juice\n2.Litchi Juice\n3.Apple Jucie\n4.Orange Juice\n5.WaterMelon Juice\n6.Guava Juice\n7.SweetLime Juice\n8.Spinach Juice\n9.Tomato Juice\n10.Grape Juice\n11.Strawberry Juice");
								int juice=Integer.parseInt(venki.readLine());
								switch(juice)
								{
									case 1: System.out.println("\nEnter the Quantity :\n1. 1-Litre - 345/-\n2. 2-Litre650/-");
											juice_lit=Integer.parseInt(venki.readLine());
											switch(juice_lit)
											{
												case 1: System.out.println("\nEnter the number of Bottles:");
														juice_quantity=Integer.parseInt(venki.readLine());
														tot_jui=juice_quantity*345;
														System.out.println("\nJuice Added!");
												break;
												case 2: System.out.println("\nEnter the number of Bottles:");
														juice_quantity=Integer.parseInt(venki.readLine());
														tot_jui=juice_quantity*500;
														System.out.println("\nJuice Added!");
												break;
												default:System.out.println("\nINVALID CHOICE!");
											}
									break;
									case 2: System.out.println("\nEnter the Quantity :\n1. 1-Litre - 345/-\n2. 2-Litre650/-");
											juice_lit=Integer.parseInt(venki.readLine());
											switch(juice_lit)
											{
												case 1: System.out.println("\nEnter the number of Bottles:");
														juice_quantity=Integer.parseInt(venki.readLine());
														tot_jui=juice_quantity*345;
														System.out.println("\nJuice Added!");
												break;
												case 2: System.out.println("\nEnter the number of Bottles:");
														juice_quantity=Integer.parseInt(venki.readLine());
														tot_jui=juice_quantity*500;
														System.out.println("\nJuice Added!");
												break;
												default:System.out.println("\nINVALID CHOICE!");
											}
									break;
									case 3: System.out.println("\nEnter the Quantity :\n1. 1-Litre - 345/-\n2. 2-Litre650/-");
											juice_lit=Integer.parseInt(venki.readLine());
											switch(juice_lit)
											{
												case 1: System.out.println("\nEnter the number of Bottles:");
														juice_quantity=Integer.parseInt(venki.readLine());
														tot_jui=juice_quantity*345;
														System.out.println("\nJuice Added!");
												break;
												case 2: System.out.println("\nEnter the number of Bottles:");
														juice_quantity=Integer.parseInt(venki.readLine());
														tot_jui=juice_quantity*500;
														System.out.println("\nJuice Added!");
												break;
												default:System.out.println("\nINVALID CHOICE!");
											}
									break;
									case 4: System.out.println("\nEnter the Quantity :\n1. 1-Litre - 345/-\n2. 2-Litre650/-");
											juice_lit=Integer.parseInt(venki.readLine());
											switch(juice_lit)
											{
												case 1: System.out.println("\nEnter the number of Bottles:");
														juice_quantity=Integer.parseInt(venki.readLine());
														tot_jui=juice_quantity*345;
														System.out.println("\nJuice Added!");
												break;
												case 2: System.out.println("\nEnter the number of Bottles:");
														juice_quantity=Integer.parseInt(venki.readLine());
														tot_jui=juice_quantity*500;
														System.out.println("\nJuice Added!");
												break;
												default:System.out.println("\nINVALID CHOICE!");
											}
									break;
									case 5: System.out.println("\nEnter the Quantity :\n1. 1-Litre - 345/-\n2. 2-Litre650/-");
											juice_lit=Integer.parseInt(venki.readLine());
											switch(juice_lit)
											{
												case 1: System.out.println("\nEnter the number of Bottles:");
														juice_quantity=Integer.parseInt(venki.readLine());
														tot_jui=juice_quantity*345;
														System.out.println("\nJuice Added!");
												break;
												case 2: System.out.println("\nEnter the number of Bottles:");
														juice_quantity=Integer.parseInt(venki.readLine());
														tot_jui=juice_quantity*500;
														System.out.println("\nJuice Added!");
												break;
												default:System.out.println("\nINVALID CHOICE!");
											}
									break;
									case 6: System.out.println("\nEnter the Quantity :\n1. 1-Litre - 345/-\n2. 2-Litre650/-");
											juice_lit=Integer.parseInt(venki.readLine());
											switch(juice_lit)
											{
												case 1: System.out.println("\nEnter the number of Bottles:");
														juice_quantity=Integer.parseInt(venki.readLine());
														tot_jui=juice_quantity*345;
														System.out.println("\nJuice Added!");
												break;
												case 2: System.out.println("\nEnter the number of Bottles:");
														juice_quantity=Integer.parseInt(venki.readLine());
														tot_jui=juice_quantity*500;
														System.out.println("\nJuice Added!");
												break;
												default:System.out.println("\nINVALID CHOICE!");
											}
									break;
									case 7: System.out.println("\nEnter the Quantity :\n1. 1-Litre - 345/-\n2. 2-Litre650/-");
											juice_lit=Integer.parseInt(venki.readLine());
											switch(juice_lit)
											{
												case 1: System.out.println("\nEnter the number of Bottles:");
														juice_quantity=Integer.parseInt(venki.readLine());
														tot_jui=juice_quantity*345;
														System.out.println("\nJuice Added!");
												break;
												case 2: System.out.println("\nEnter the number of Bottles:");
														juice_quantity=Integer.parseInt(venki.readLine());
														tot_jui=juice_quantity*500;
														System.out.println("\nJuice Added!");
												break;
												default:System.out.println("\nINVALID CHOICE!");
											}
									break;
									case 8: System.out.println("\nEnter the Quantity :\n1. 1-Litre - 345/-\n2. 2-Litre650/-");
											juice_lit=Integer.parseInt(venki.readLine());
											switch(juice_lit)
											{
												case 1: System.out.println("\nEnter the number of Bottles:");
														juice_quantity=Integer.parseInt(venki.readLine());
														tot_jui=juice_quantity*345;
														System.out.println("\nJuice Added!");
												break;
												case 2: System.out.println("\nEnter the number of Bottles:");
														juice_quantity=Integer.parseInt(venki.readLine());
														tot_jui=juice_quantity*500;
														System.out.println("\nJuice Added!");
												break;
												default:System.out.println("\nINVALID CHOICE!");
											}
									break;
									case 9: System.out.println("\nEnter the Quantity :\n1. 1-Litre - 345/-\n2. 2-Litre650/-");
											juice_lit=Integer.parseInt(venki.readLine());
											switch(juice_lit)
											{
												case 1: System.out.println("\nEnter the number of Bottles:");
														juice_quantity=Integer.parseInt(venki.readLine());
														tot_jui=juice_quantity*345;
														System.out.println("\nJuice Added!");
												break;
												case 2: System.out.println("\nEnter the number of Bottles:");
														juice_quantity=Integer.parseInt(venki.readLine());
														tot_jui=juice_quantity*500;
														System.out.println("\nJuice Added!");
												break;
												default:System.out.println("\nINVALID CHOICE!");
											}
									break;
									case 10: System.out.println("\nEnter the Quantity :\n1. 1-Litre - 345/-\n2. 2-Litre650/-");
											juice_lit=Integer.parseInt(venki.readLine());
											switch(juice_lit)
											{
												case 1: System.out.println("\nEnter the number of Bottles:");
														juice_quantity=Integer.parseInt(venki.readLine());
														tot_jui=juice_quantity*345;
														System.out.println("\nJuice Added!");
												break;
												case 2: System.out.println("\nEnter the number of Bottles:");
														juice_quantity=Integer.parseInt(venki.readLine());
														tot_jui=juice_quantity*500;
														System.out.println("\nJuice Added!");
												break;
												default:System.out.println("\nINVALID CHOICE!");
											}
									break;
									case 11: System.out.println("\nEnter the Quantity :\n1. 1-Litre - 345/-\n2. 2-Litre650/-");
											juice_lit=Integer.parseInt(venki.readLine());
											switch(juice_lit)
											{
												case 1: System.out.println("\nEnter the number of Bottles:");
														juice_quantity=Integer.parseInt(venki.readLine());
														tot_jui=juice_quantity*345;
														System.out.println("\nJuice Added!");
												break;
												case 2: System.out.println("\nEnter the number of Bottles:");
														juice_quantity=Integer.parseInt(venki.readLine());
														tot_jui=juice_quantity*500;
														System.out.println("\nJuice Added!");
												break;
												default:System.out.println("\nINVALID CHOICE!");
											}
									break;
									default:System.out.println("\nINVALID CHOICE!");
								}
						break;
				tot_juice+=tot_jui;
						case 5: System.out.println("\nChoose the Item you wish to buy:\n1.Milk\n2.Curd\n3.Flavoured Milk\n4.Paneer\n5.Butter\n6.Cheese");
								int dairy=Integer.parseInt(venki.readLine());
								switch(dairy)
								{
									case 1: System.out.println("\nChoose the brand for your Milk:\n1.Nandini 20/-\n2.Aditya - 18/-\n3.Shri Krishna - 15/-\n4.Aarogya - 18/-\n5.Amul - 35/-\n\tNOTE: Minimum Quantity 1L..");
											dairy_company_choice=Integer.parseInt(venki.readLine());
											switch(milk_company_choice)
											{
												case 1: System.out.println("\nEnter the quantity:");
														milk_quantity=Integer.parseInt(venki.readLine());
														tot_mil=milk_quantity*20;
														System.out.println("\nMilk Added!");
												break;
												case 2: System.out.println("\nEnter the quantity:");
														milk_quantity=Integer.parseInt(venki.readLine());
														tot_mil=milk_quantity*18;
														System.out.println("\nMilk Added!");
												break;
												case 3: System.out.println("\nEnter the quantity:");
														milk_quantity=Integer.parseInt(venki.readLine());
														tot_mil=milk_quantity*15;
														System.out.println("\nMilk Added!");
												break;
												case 4: System.out.println("\nEnter the quantity:");
														milk_quantity=Integer.parseInt(venki.readLine());
														tot_mil=milk_quantity*18;
														System.out.println("\nMilk Added!");
												break;
												case 5: System.out.println("\nEnter the quantity:");
														milk_quantity=Integer.parseInt(venki.readLine());
														tot_mil=milk_quantity*35;
														System.out.println("\nMilk Added!");
												break;
												default: System.out.println("\nINVALID CHOICE!");
											}
									break;
				tot_milk+=tot_mil;
									case 2: System.out.println("\nChoose the brand for your curd:\n1.Amul \n2.CoCo berry\n3.Nestle\n4.Britannia\n5.Gowardhan");
											dairy_company_choice=Integer.parseInt(venki.readLine());
											switch(dairy_company_choice)
											{
												case 1: System.out.println("\nEnter the quantity\n1.100ml - 15/-\n2.150ml - 30/-\n3.500ml - 55/-\n4.1L - 70/-\n5.2L - 105/-");
														flavour_lit=Ineteger.parseInt(venki.readLine());
														switch(flavour_lit)
														{
															case 1: System.out.println("\nEnter the number of cups:");
																	curd_quantity=Integer.parseInt(venki.readLine());
																	tot_cur=curd_quantity*15;
																	System.out.println("\nCurd Added!");
															break;
															case 2: System.out.println("\nEnter the number of cups:");
																	curd_quantity=Integer.parseInt(venki.readLine());
																	tot_cur=curd_quantity*30;
																	System.out.println("\nCurd Added!");
															break;
															case 3: System.out.println("\nEnter the number of cups:");
																	curd_quantity=Integer.parseInt(venki.readLine());
																	tot_cur=curd_quantity*55;
																	System.out.println("\nCurd Added!");
															break;
															case 4: System.out.println("\nEnter the number of cups:");
																	curd_quantity=Integer.parseInt(venki.readLine());
																	tot_cur=curd_quantity*70;
																	System.out.println("\nCurd Added!");
															break;
															case 5: System.out.println("\nEnter the number of cups:");
																	curd_quantity=Integer.parseInt(venki.readLine());
																	tot_cur=curd_quantity*105;
																	System.out.println("\nCurd Added!");
															break;
															default:System.out.println("\nINVALID CHOICE!");
														}
												break;
												case 2: System.out.println("\nEnter the quantity:\n1.100ml - 12/-\n2.150ml - 25/-\n3.500ml -40/-\n4.1L - 65/-\n5.2L - 99/-");
														flavour_lit=Integer.parseInt(venki.readLine());
														switch(curd_lit)
														{
															case 1: System.out.println("\nEnter the number of cups:");
																	curd_quantity=Integer.parseInt(venki.readLine());
																	tot_cur=curd_quantity*12;
																	System.out.println("\nCurd Added!");
															break;
															case 2: System.out.println("\nEnter the number of cups:");
																	curd_quantity=Integer.parseInt(venki.readLine());
																	tot_cur=curd_quantity*25;
																	System.out.println("\nCurd Added!");
															break;
															case 3: System.out.println("\nEnter the number of cups:");
																	curd_quantity=Integer.parseInt(venki.readLine());
																	tot_cur=curd_quantity*40;
																	System.out.println("\nCurd Added!");
															break;
															case 4: System.out.println("\nEnter the number of cups:");
																	curd_quantity=Integer.parseInt(venki.readLine());
																	tot_cur=curd_quantity*65;
																	System.out.println("\nCurd Added!");
															break;
															case 5: System.out.println("\nEnter the number of cups:");
																	curd_quantity=Integer.parseInt(venki.readLine());
																	tot_cur=curd_quantity*99;
																	System.out.println("\nCurd Added!");
															break;
															default:System.out.println("\nINVALID CHOICE!");
														}
												break;
												case 3: System.out.println("\nEnter the quantity:\n1.100ml - 16/-\n2.150ml - 34/-\n3.500ml -57/-\n4.1L - 85/-\n5.2L - 109/-");
														curd_lit=Integer.parseInt(venki.readLine());
														switch(curd_lit)
														{
															case 1: System.out.println("\nEnter the number of cups:");
																	curd_quantity=Integer.parseInt(venki.readLine());
																	tot_cur=curd_quantity*16;
																	System.out.println("\nCurd Added!");
															break;
															case 2: System.out.println("\nEnter the number of cups:");
																	curd_quantity=Integer.parseInt(venki.readLine());
																	tot_cur=curd_quantity*34;
																	System.out.println("\nCurd Added!");
															break;
															case 3: System.out.println("\nEnter the number of cups:");
																	curd_quantity=Integer.parseInt(venki.readLine());
																	tot_cur=curd_quantity*57;
																	System.out.println("\nCurd Added!");
															break;
															case 4: System.out.println("\nEnter the number of cups:");
																	curd_quantity=Integer.parseInt(venki.readLine());
																	tot_cur=curd_quantity*85;
																	System.out.println("\nCurd Added!");
															break;
															case 5: System.out.println("\nEnter the number of cups:");
																	curd_quantity=Integer.parseInt(venki.readLine());
																	tot_cur=curd_quantity*109;
																	System.out.println("\nCurd Added!");
															break;
															default:System.out.println("\nINVALID CHOICE!");
														}
												break;
												case 4: System.out.println("\nEnter the quantity:\n1.100ml - 16/-\n2.150ml - 34/-\n3.500ml -57/-\n4.1L - 85/-\n5.2L - 109/-");
														curd_lit=Integer.parseInt(venki.readLine());
														switch(curd_lit)
														{
															case 1: System.out.println("\nEnter the number of cups:");
																	curd_quantity=Integer.parseInt(venki.readLine());
																	tot_cur=curd_quantity*16;
																	System.out.println("\nCurd Added!");
															break;
															case 2: System.out.println("\nEnter the number of cups:");
																	curd_quantity=Integer.parseInt(venki.readLine());
																	tot_cur=curd_quantity*34;
																	System.out.println("\nCurd Added!");
															break;
															case 3: System.out.println("\nEnter the number of cups:");
																	curd_quantity=Integer.parseInt(venki.readLine());
																	tot_cur=curd_quantity*57;
																	System.out.println("\nCurd Added!");
															break;
															case 4: System.out.println("\nEnter the number of cups:");
																	curd_quantity=Integer.parseInt(venki.readLine());
																	tot_cur=curd_quantity*85;
																	System.out.println("\nCurd Added!");
															break;
															case 5: System.out.println("\nEnter the number of cups:");
																	curd_quantity=Integer.parseInt(venki.readLine());
																	tot_cur=curd_quantity*109;
																	System.out.println("\nCurd Added!");
															break;
															default:System.out.println("\nINVALID CHOICE!");
														}
												break;
												case 5: System.out.println("\nEnter the quantity:\n1.100ml - 12/-\n2.150ml - 32/-\n3.500ml -50/-\n4.1L - 79/-\n5.2L - 100/-");
														curd_lit=Integer.parseInt(venki.readLine());
														switch(curd_lit)
														{
															case 1: System.out.println("\nEnter the number of cups:");
																	curd_quantity=Integer.parseInt(venki.readLine());
																	tot_cur=curd_quantity*12;
																	System.out.println("\nCurd Added!");
															break;
															case 2: System.out.println("\nEnter the number of cups:");
																	curd_quantity=Integer.parseInt(venki.readLine());
																	tot_cur=curd_quantity*32;
																	System.out.println("\nCurd Added!");
															break;
															case 3: System.out.println("\nEnter the number of cups:");
																	curd_quantity=Integer.parseInt(venki.readLine());
																	tot_cur=curd_quantity*50;
																	System.out.println("\nCurd Added!");
															break;
															case 4: System.out.println("\nEnter the number of cups:");
																	curd_quantity=Integer.parseInt(venki.readLine());
																	tot_cur=curd_quantity*79;
																	System.out.println("\nCurd Added!");
															break;
															case 5: System.out.println("\nEnter the number of cups:");
																	curd_quantity=Integer.parseInt(venki.readLine());
																	tot_cur=curd_quantity*100;
																	System.out.println("\nCurd Added!");
															break;
															default:System.out.println("\nINVALID CHOICE!");
														}
												break;
												default:System.out.println("\nINVALID CHOICE!");
											}
									break;
				tot_curd+=tot_cur;
									case 3: System.out.println("\nChoose the brand:\n1.Nandini \n2.Aditya \n3.Shri Krishna \n4.Aarogya \n5.Amul ");\
											flavouredmilk_company_choice=Integer.parseInt(venki.readLine());
											switch(flavouredmilk_company_choice)
											{
												case 1: System.out.println("\nChoose the flavour:\n1.Mango\n2.Orange\n3.Apple\n4.Pista\n5.Strawberry\n6.Sweet Lime");
														int flavour=Integer.parseInt(venki.readLine());
														switch(flavour)
														{
															case 1: System.out.println("\nChoose the amount:\n1.250ml - 10/-\n2.500ml - 30/-\n3.850ml - 65/-\n4.1L - 90/-");
																	flavour_lit=Integer.parseInt(venki.readLine());
																	switch(flavour_lit)
																	{
																		case 1: System.out.println("\nEnter the quantity:");
																				flavoured_quantity=Integer.parseInt(venki.readLine());
																				tot_flavour=flavoured_quantity*10;
																				System.out.println("\nFlavoured Milk Added!");
																		break;
																		case 2: System.out.println("\nEnter the quantity:");
																				flavoured_quantity=Integer.parseInt(venki.readLine());
																				tot_flavour=flavoured_quantity*30;
																				System.out.println("\nFlavoured Milk Added!");
																		break;
																		case 3: System.out.println("\nEnter the quantity:");
																				flavoured_quantity=Integer.parseInt(venki.readLine());
																				tot_flavour=flavoured_quantity*65;
																				System.out.println("\nFlavoured Milk Added!");
																		break;
																		case 4: System.out.println("\nEnter the quantity:");
																				flavoured_quantity=Integer.parseInt(venki.readLine());
																				tot_flavour=flavoured_quantity*90;
																				System.out.println("\nFlavoured Milk Added!");
																		break;
																		default: System.out.println("\nINVALID CHOICE")
																	}
															break;
															case 2: System.out.println("\nChoose the amount:\n1.250ml - 10/-\n2.500ml - 30/-\n3.850ml - 65/-\n4.1L - 90/-");
																	flavour_lit=Integer.parseInt(venki.readLine());
																	switch(flavour_lit)
																	{
																		case 1: System.out.println("\nEnter the quantity:");
																				flavoured_quantity=Integer.parseInt(venki.readLine());
																				tot_flavour=flavoured_quantity*10;
																				System.out.println("\nFlavoured Milk Added!");
																		break;
																		case 2: System.out.println("\nEnter the quantity:");
																				flavoured_quantity=Integer.parseInt(venki.readLine());
																				tot_flavour=flavoured_quantity*30;
																				System.out.println("\nFlavoured Milk Added!");
																		break;
																		case 3: System.out.println("\nEnter the quantity:");
																				flavoured_quantity=Integer.parseInt(venki.readLine());
																				tot_flavour=flavoured_quantity*65;
																				System.out.println("\nFlavoured Milk Added!");
																		break;
																		case 4: System.out.println("\nEnter the quantity:");
																				flavoured_quantity=Integer.parseInt(venki.readLine());
																				tot_flavour=flavoured_quantity*90;
																				System.out.println("\nFlavoured Milk Added!");
																		break;
																		default: System.out.println("\nINVALID CHOICE")
																	}
															break;
															case 3: System.out.println("\nChoose the amount:\n1.250ml - 10/-\n2.500ml - 30/-\n3.850ml - 65/-\n4.1L - 90/-");
																	flavour_lit=Integer.parseInt(venki.readLine());
																	switch(flavour_lit)
																	{
																		case 1: System.out.println("\nEnter the quantity:");
																				flavoured_quantity=Integer.parseInt(venki.readLine());
																				tot_flavour=flavoured_quantity*10;
																				System.out.println("\nFlavoured Milk Added!");
																		break;
																		case 2: System.out.println("\nEnter the quantity:");
																				flavoured_quantity=Integer.parseInt(venki.readLine());
																				tot_flavour=flavoured_quantity*30;
																				System.out.println("\nFlavoured Milk Added!");
																		break;
																		case 3: System.out.println("\nEnter the quantity:");
																				flavoured_quantity=Integer.parseInt(venki.readLine());
																				tot_flavour=flavoured_quantity*65;
																				System.out.println("\nFlavoured Milk Added!");
																		break;
																		case 4: System.out.println("\nEnter the quantity:");
																				flavoured_quantity=Integer.parseInt(venki.readLine());
																				tot_flavour=flavoured_quantity*90;
																				System.out.println("\nFlavoured Milk Added!");
																		break;
																		default: System.out.println("\nINVALID CHOICE")
																	}
															break;
															case 4: System.out.println("\nChoose the amount:\n1.250ml - 10/-\n2.500ml - 30/-\n3.850ml - 65/-\n4.1L - 90/-");
																	flavour_lit=Integer.parseInt(venki.readLine());
																	switch(flavour_lit)
																	{
																		case 1: System.out.println("\nEnter the quantity:");
																				flavoured_quantity=Integer.parseInt(venki.readLine());
																				tot_flavour=flavoured_quantity*10;
																				System.out.println("\nFlavoured Milk Added!");
																		break;
																		case 2: System.out.println("\nEnter the quantity:");
																				flavoured_quantity=Integer.parseInt(venki.readLine());
																				tot_flavour=flavoured_quantity*30;
																				System.out.println("\nFlavoured Milk Added!");
																		break;
																		case 3: System.out.println("\nEnter the quantity:");
																				flavoured_quantity=Integer.parseInt(venki.readLine());
																				tot_flavour=flavoured_quantity*65;
																				System.out.println("\nFlavoured Milk Added!");
																		break;
																		case 4: System.out.println("\nEnter the quantity:");
																				flavoured_quantity=Integer.parseInt(venki.readLine());
																				tot_flavour=flavoured_quantity*90;
																				System.out.println("\nFlavoured Milk Added!");
																		break;
																		default: System.out.println("\nINVALID CHOICE")
																	}
															break;
															case 5: System.out.println("\nChoose the amount:\n1.250ml - 10/-\n2.500ml - 30/-\n3.850ml - 65/-\n4.1L - 90/-");
																	flavour_lit=Integer.parseInt(venki.readLine());
																	switch(flavour_lit)
																	{
																		case 1: System.out.println("\nEnter the quantity:");
																				flavoured_quantity=Integer.parseInt(venki.readLine());
																				tot_flavour=flavoured_quantity*10;
																				System.out.println("\nFlavoured Milk Added!");
																		break;
																		case 2: System.out.println("\nEnter the quantity:");
																				flavoured_quantity=Integer.parseInt(venki.readLine());
																				tot_flavour=flavoured_quantity*30;
																				System.out.println("\nFlavoured Milk Added!");
																		break;
																		case 3: System.out.println("\nEnter the quantity:");
																				flavoured_quantity=Integer.parseInt(venki.readLine());
																				tot_flavour=flavoured_quantity*65;
																				System.out.println("\nFlavoured Milk Added!");
																		break;
																		case 4: System.out.println("\nEnter the quantity:");
																				flavoured_quantity=Integer.parseInt(venki.readLine());
																				tot_flavour=flavoured_quantity*90;
																				System.out.println("\nFlavoured Milk Added!");
																		break;
																		default: System.out.println("\nINVALID CHOICE")
																	}
															break;
															case 6: System.out.println("\nChoose the amount:\n1.250ml - 10/-\n2.500ml - 30/-\n3.850ml - 65/-\n4.1L - 90/-");
																	flavour_lit=Integer.parseInt(venki.readLine());
																	switch(flavour_lit)
																	{
																		case 1: System.out.println("\nEnter the quantity:");
																				flavoured_quantity=Integer.parseInt(venki.readLine());
																				tot_flavour=flavoured_quantity*10;
																				System.out.println("\nFlavoured Milk Added!");
																		break;
																		case 2: System.out.println("\nEnter the quantity:");
																				flavoured_quantity=Integer.parseInt(venki.readLine());
																				tot_flavour=flavoured_quantity*30;
																				System.out.println("\nFlavoured Milk Added!");
																		break;
																		case 3: System.out.println("\nEnter the quantity:");
																				flavoured_quantity=Integer.parseInt(venki.readLine());
																				tot_flavour=flavoured_quantity*65;
																				System.out.println("\nFlavoured Milk Added!");
																		break;
																		case 4: System.out.println("\nEnter the quantity:");
																				flavoured_quantity=Integer.parseInt(venki.readLine());
																				tot_flavour=flavoured_quantity*90;
																				System.out.println("\nFlavoured Milk Added!");
																		break;
																		default: System.out.println("\nINVALID CHOICE")
																	}
															break;
															default:System.out.println("\nINVALID CHOICE!");
														}
												break;
												
												case 2: System.out.println("\nChoose the flavour:\n1.Mango\n2.Orange\n3.Apple\n4.Pista\n5.Strawberry\n6.Sweet Lime");
														int flavour=Integer.parseInt(venki.readLine());
														switch(flavour)
														{
															case 1: System.out.println("\nChoose the amount:\n1.250ml - 10/-\n2.500ml - 30/-\n3.850ml - 65/-\n4.1L - 90/-");
																	flavour_lit=Integer.parseInt(venki.readLine());
																	switch(flavour_lit)
																	{
																		case 1: System.out.println("\nEnter the quantity:");
																				flavoured_quantity=Integer.parseInt(venki.readLine());
																				tot_flavour=flavoured_quantity*10;
																				System.out.println("\nFlavoured Milk Added!");
																		break;
																		case 2: System.out.println("\nEnter the quantity:");
																				flavoured_quantity=Integer.parseInt(venki.readLine());
																				tot_flavour=flavoured_quantity*30;
																				System.out.println("\nFlavoured Milk Added!");
																		break;
																		case 3: System.out.println("\nEnter the quantity:");
																				flavoured_quantity=Integer.parseInt(venki.readLine());
																				tot_flavour=flavoured_quantity*65;
																				System.out.println("\nFlavoured Milk Added!");
																		break;
																		case 4: System.out.println("\nEnter the quantity:");
																				flavoured_quantity=Integer.parseInt(venki.readLine());
																				tot_flavour=flavoured_quantity*90;
																				System.out.println("\nFlavoured Milk Added!");
																		break;
																		default: System.out.println("\nINVALID CHOICE")
																	}
															break;
															case 2: System.out.println("\nChoose the amount:\n1.250ml - 10/-\n2.500ml - 30/-\n3.850ml - 65/-\n4.1L - 90/-");
																	flavour_lit=Integer.parseInt(venki.readLine());
																	switch(flavour_lit)
																	{
																		case 1: System.out.println("\nEnter the quantity:");
																				flavoured_quantity=Integer.parseInt(venki.readLine());
																				tot_flavour=flavoured_quantity*10;
																				System.out.println("\nFlavoured Milk Added!");
																		break;
																		case 2: System.out.println("\nEnter the quantity:");
																				flavoured_quantity=Integer.parseInt(venki.readLine());
																				tot_flavour=flavoured_quantity*30;
																				System.out.println("\nFlavoured Milk Added!");
																		break;
																		case 3: System.out.println("\nEnter the quantity:");
																				flavoured_quantity=Integer.parseInt(venki.readLine());
																				tot_flavour=flavoured_quantity*65;
																				System.out.println("\nFlavoured Milk Added!");
																		break;
																		case 4: System.out.println("\nEnter the quantity:");
																				flavoured_quantity=Integer.parseInt(venki.readLine());
																				tot_flavour=flavoured_quantity*90;
																				System.out.println("\nFlavoured Milk Added!");
																		break;
																		default: System.out.println("\nINVALID CHOICE")
																	}
															break;
															case 3: System.out.println("\nChoose the amount:\n1.250ml - 10/-\n2.500ml - 30/-\n3.850ml - 65/-\n4.1L - 90/-");
																	flavour_lit=Integer.parseInt(venki.readLine());
																	switch(flavour_lit)
																	{
																		case 1: System.out.println("\nEnter the quantity:");
																				flavoured_quantity=Integer.parseInt(venki.readLine());
																				tot_flavour=flavoured_quantity*10;
																				System.out.println("\nFlavoured Milk Added!");
																		break;
																		case 2: System.out.println("\nEnter the quantity:");
																				flavoured_quantity=Integer.parseInt(venki.readLine());
																				tot_flavour=flavoured_quantity*30;
																				System.out.println("\nFlavoured Milk Added!");
																		break;
																		case 3: System.out.println("\nEnter the quantity:");
																				flavoured_quantity=Integer.parseInt(venki.readLine());
																				tot_flavour=flavoured_quantity*65;
																				System.out.println("\nFlavoured Milk Added!");
																		break;
																		case 4: System.out.println("\nEnter the quantity:");
																				flavoured_quantity=Integer.parseInt(venki.readLine());
																				tot_flavour=flavoured_quantity*90;
																				System.out.println("\nFlavoured Milk Added!");
																		break;
																		default: System.out.println("\nINVALID CHOICE")
																	}
															break;
															case 4: System.out.println("\nChoose the amount:\n1.250ml - 10/-\n2.500ml - 30/-\n3.850ml - 65/-\n4.1L - 90/-");
																	flavour_lit=Integer.parseInt(venki.readLine());
																	switch(flavour_lit)
																	{
																		case 1: System.out.println("\nEnter the quantity:");
																				flavoured_quantity=Integer.parseInt(venki.readLine());
																				tot_flavour=flavoured_quantity*10;
																				System.out.println("\nFlavoured Milk Added!");
																		break;
																		case 2: System.out.println("\nEnter the quantity:");
																				flavoured_quantity=Integer.parseInt(venki.readLine());
																				tot_flavour=flavoured_quantity*30;
																				System.out.println("\nFlavoured Milk Added!");
																		break;
																		case 3: System.out.println("\nEnter the quantity:");
																				flavoured_quantity=Integer.parseInt(venki.readLine());
																				tot_flavour=flavoured_quantity*65;
																				System.out.println("\nFlavoured Milk Added!");
																		break;
																		case 4: System.out.println("\nEnter the quantity:");
																				flavoured_quantity=Integer.parseInt(venki.readLine());
																				tot_flavour=flavoured_quantity*90;
																				System.out.println("\nFlavoured Milk Added!");
																		break;
																		default: System.out.println("\nINVALID CHOICE")
																	}
															break;
															case 5: System.out.println("\nChoose the amount:\n1.250ml - 10/-\n2.500ml - 30/-\n3.850ml - 65/-\n4.1L - 90/-");
																	flavour_lit=Integer.parseInt(venki.readLine());
																	switch(flavour_lit)
																	{
																		case 1: System.out.println("\nEnter the quantity:");
																				flavoured_quantity=Integer.parseInt(venki.readLine());
																				tot_flavour=flavoured_quantity*10;
																				System.out.println("\nFlavoured Milk Added!");
																		break;
																		case 2: System.out.println("\nEnter the quantity:");
																				flavoured_quantity=Integer.parseInt(venki.readLine());
																				tot_flavour=flavoured_quantity*30;
																				System.out.println("\nFlavoured Milk Added!");
																		break;
																		case 3: System.out.println("\nEnter the quantity:");
																				flavoured_quantity=Integer.parseInt(venki.readLine());
																				tot_flavour=flavoured_quantity*65;
																				System.out.println("\nFlavoured Milk Added!");
																		break;
																		case 4: System.out.println("\nEnter the quantity:");
																				flavoured_quantity=Integer.parseInt(venki.readLine());
																				tot_flavour=flavoured_quantity*90;
																				System.out.println("\nFlavoured Milk Added!");
																		break;
																		default: System.out.println("\nINVALID CHOICE")
																	}
															break;
															case 6: System.out.println("\nChoose the amount:\n1.250ml - 10/-\n2.500ml - 30/-\n3.850ml - 65/-\n4.1L - 90/-");
																	flavour_lit=Integer.parseInt(venki.readLine());
																	switch(flavour_lit)
																	{
																		case 1: System.out.println("\nEnter the quantity:");
																				flavoured_quantity=Integer.parseInt(venki.readLine());
																				tot_flavour=flavoured_quantity*10;
																				System.out.println("\nFlavoured Milk Added!");
																		break;
																		case 2: System.out.println("\nEnter the quantity:");
																				flavoured_quantity=Integer.parseInt(venki.readLine());
																				tot_flavour=flavoured_quantity*30;
																				System.out.println("\nFlavoured Milk Added!");
																		break;
																		case 3: System.out.println("\nEnter the quantity:");
																				flavoured_quantity=Integer.parseInt(venki.readLine());
																				tot_flavour=flavoured_quantity*65;
																				System.out.println("\nFlavoured Milk Added!");
																		break;
																		case 4: System.out.println("\nEnter the quantity:");
																				flavoured_quantity=Integer.parseInt(venki.readLine());
																				tot_flavour=flavoured_quantity*90;
																				System.out.println("\nFlavoured Milk Added!");
																		break;
																		default: System.out.println("\nINVALID CHOICE")
																	}
															break;
															default:System.out.println("\nINVALID CHOICE!");
														}
												break;
												case 3: System.out.println("\nChoose the flavour:\n1.Mango\n2.Orange\n3.Apple\n4.Pista\n5.Strawberry\n6.Sweet Lime");
														int flavour=Integer.parseInt(venki.readLine());
														switch(flavour)
														{
															case 1: System.out.println("\nChoose the amount:\n1.250ml - 10/-\n2.500ml - 30/-\n3.850ml - 65/-\n4.1L - 90/-");
																	flavour_lit=Integer.parseInt(venki.readLine());
																	switch(flavour_lit)
																	{
																		case 1: System.out.println("\nEnter the quantity:");
																				flavoured_quantity=Integer.parseInt(venki.readLine());
																				tot_flavour=flavoured_quantity*10;
																				System.out.println("\nFlavoured Milk Added!");
																		break;
																		case 2: System.out.println("\nEnter the quantity:");
																				flavoured_quantity=Integer.parseInt(venki.readLine());
																				tot_flavour=flavoured_quantity*30;
																				System.out.println("\nFlavoured Milk Added!");
																		break;
																		case 3: System.out.println("\nEnter the quantity:");
																				flavoured_quantity=Integer.parseInt(venki.readLine());
																				tot_flavour=flavoured_quantity*65;
																				System.out.println("\nFlavoured Milk Added!");
																		break;
																		case 4: System.out.println("\nEnter the quantity:");
																				flavoured_quantity=Integer.parseInt(venki.readLine());
																				tot_flavour=flavoured_quantity*90;
																				System.out.println("\nFlavoured Milk Added!");
																		break;
																		default: System.out.println("\nINVALID CHOICE")
																	}
															break;
															case 2: System.out.println("\nChoose the amount:\n1.250ml - 10/-\n2.500ml - 30/-\n3.850ml - 65/-\n4.1L - 90/-");
																	flavour_lit=Integer.parseInt(venki.readLine());
																	switch(flavour_lit)
																	{
																		case 1: System.out.println("\nEnter the quantity:");
																				flavoured_quantity=Integer.parseInt(venki.readLine());
																				tot_flavour=flavoured_quantity*10;
																				System.out.println("\nFlavoured Milk Added!");
																		break;
																		case 2: System.out.println("\nEnter the quantity:");
																				flavoured_quantity=Integer.parseInt(venki.readLine());
																				tot_flavour=flavoured_quantity*30;
																				System.out.println("\nFlavoured Milk Added!");
																		break;
																		case 3: System.out.println("\nEnter the quantity:");
																				flavoured_quantity=Integer.parseInt(venki.readLine());
																				tot_flavour=flavoured_quantity*65;
																				System.out.println("\nFlavoured Milk Added!");
																		break;
																		case 4: System.out.println("\nEnter the quantity:");
																				flavoured_quantity=Integer.parseInt(venki.readLine());
																				tot_flavour=flavoured_quantity*90;
																				System.out.println("\nFlavoured Milk Added!");
																		break;
																		default: System.out.println("\nINVALID CHOICE")
																	}
															break;
															case 3: System.out.println("\nChoose the amount:\n1.250ml - 10/-\n2.500ml - 30/-\n3.850ml - 65/-\n4.1L - 90/-");
																	flavour_lit=Integer.parseInt(venki.readLine());
																	switch(flavour_lit)
																	{
																		case 1: System.out.println("\nEnter the quantity:");
																				flavoured_quantity=Integer.parseInt(venki.readLine());
																				tot_flavour=flavoured_quantity*10;
																				System.out.println("\nFlavoured Milk Added!");
																		break;
																		case 2: System.out.println("\nEnter the quantity:");
																				flavoured_quantity=Integer.parseInt(venki.readLine());
																				tot_flavour=flavoured_quantity*30;
																				System.out.println("\nFlavoured Milk Added!");
																		break;
																		case 3: System.out.println("\nEnter the quantity:");
																				flavoured_quantity=Integer.parseInt(venki.readLine());
																				tot_flavour=flavoured_quantity*65;
																				System.out.println("\nFlavoured Milk Added!");
																		break;
																		case 4: System.out.println("\nEnter the quantity:");
																				flavoured_quantity=Integer.parseInt(venki.readLine());
																				tot_flavour=flavoured_quantity*90;
																				System.out.println("\nFlavoured Milk Added!");
																		break;
																		default: System.out.println("\nINVALID CHOICE")
																	}
															break;
															case 4: System.out.println("\nChoose the amount:\n1.250ml - 10/-\n2.500ml - 30/-\n3.850ml - 65/-\n4.1L - 90/-");
																	flavour_lit=Integer.parseInt(venki.readLine());
																	switch(flavour_lit)
																	{
																		case 1: System.out.println("\nEnter the quantity:");
																				flavoured_quantity=Integer.parseInt(venki.readLine());
																				tot_flavour=flavoured_quantity*10;
																				System.out.println("\nFlavoured Milk Added!");
																		break;
																		case 2: System.out.println("\nEnter the quantity:");
																				flavoured_quantity=Integer.parseInt(venki.readLine());
																				tot_flavour=flavoured_quantity*30;
																				System.out.println("\nFlavoured Milk Added!");
																		break;
																		case 3: System.out.println("\nEnter the quantity:");
																				flavoured_quantity=Integer.parseInt(venki.readLine());
																				tot_flavour=flavoured_quantity*65;
																				System.out.println("\nFlavoured Milk Added!");
																		break;
																		case 4: System.out.println("\nEnter the quantity:");
																				flavoured_quantity=Integer.parseInt(venki.readLine());
																				tot_flavour=flavoured_quantity*90;
																				System.out.println("\nFlavoured Milk Added!");
																		break;
																		default: System.out.println("\nINVALID CHOICE")
																	}
															break;
															case 5: System.out.println("\nChoose the amount:\n1.250ml - 10/-\n2.500ml - 30/-\n3.850ml - 65/-\n4.1L - 90/-");
																	flavour_lit=Integer.parseInt(venki.readLine());
																	switch(flavour_lit)
																	{
																		case 1: System.out.println("\nEnter the quantity:");
																				flavoured_quantity=Integer.parseInt(venki.readLine());
																				tot_flavour=flavoured_quantity*10;
																				System.out.println("\nFlavoured Milk Added!");
																		break;
																		case 2: System.out.println("\nEnter the quantity:");
																				flavoured_quantity=Integer.parseInt(venki.readLine());
																				tot_flavour=flavoured_quantity*30;
																				System.out.println("\nFlavoured Milk Added!");
																		break;
																		case 3: System.out.println("\nEnter the quantity:");
																				flavoured_quantity=Integer.parseInt(venki.readLine());
																				tot_flavour=flavoured_quantity*65;
																				System.out.println("\nFlavoured Milk Added!");
																		break;
																		case 4: System.out.println("\nEnter the quantity:");
																				flavoured_quantity=Integer.parseInt(venki.readLine());
																				tot_flavour=flavoured_quantity*90;
																				System.out.println("\nFlavoured Milk Added!");
																		break;
																		default: System.out.println("\nINVALID CHOICE")
																	}
															break;
															case 6: System.out.println("\nChoose the amount:\n1.250ml - 10/-\n2.500ml - 30/-\n3.850ml - 65/-\n4.1L - 90/-");
																	flavour_lit=Integer.parseInt(venki.readLine());
																	switch(flavour_lit)
																	{
																		case 1: System.out.println("\nEnter the quantity:");
																				flavoured_quantity=Integer.parseInt(venki.readLine());
																				tot_flavour=flavoured_quantity*10;
																				System.out.println("\nFlavoured Milk Added!");
																		break;
																		case 2: System.out.println("\nEnter the quantity:");
																				flavoured_quantity=Integer.parseInt(venki.readLine());
																				tot_flavour=flavoured_quantity*30;
																				System.out.println("\nFlavoured Milk Added!");
																		break;
																		case 3: System.out.println("\nEnter the quantity:");
																				flavoured_quantity=Integer.parseInt(venki.readLine());
																				tot_flavour=flavoured_quantity*65;
																				System.out.println("\nFlavoured Milk Added!");
																		break;
																		case 4: System.out.println("\nEnter the quantity:");
																				flavoured_quantity=Integer.parseInt(venki.readLine());
																				tot_flavour=flavoured_quantity*90;
																				System.out.println("\nFlavoured Milk Added!");
																		break;
																		default: System.out.println("\nINVALID CHOICE")
																	}
															break;
															default:System.out.println("\nINVALID CHOICE!");
														}
												break;
												case 4: System.out.println("\nChoose the flavour:\n1.Mango\n2.Orange\n3.Apple\n4.Pista\n5.Strawberry\n6.Sweet Lime");
														int flavour=Integer.parseInt(venki.readLine());
														switch(flavour)
														{
															case 1: System.out.println("\nChoose the amount:\n1.250ml - 10/-\n2.500ml - 30/-\n3.850ml - 65/-\n4.1L - 90/-");
																	flavour_lit=Integer.parseInt(venki.readLine());
																	switch(flavour_lit)
																	{
																		case 1: System.out.println("\nEnter the quantity:");
																				flavoured_quantity=Integer.parseInt(venki.readLine());
																				tot_flavour=flavoured_quantity*10;
																				System.out.println("\nFlavoured Milk Added!");
																		break;
																		case 2: System.out.println("\nEnter the quantity:");
																				flavoured_quantity=Integer.parseInt(venki.readLine());
																				tot_flavour=flavoured_quantity*30;
																				System.out.println("\nFlavoured Milk Added!");
																		break;
																		case 3: System.out.println("\nEnter the quantity:");
																				flavoured_quantity=Integer.parseInt(venki.readLine());
																				tot_flavour=flavoured_quantity*65;
																				System.out.println("\nFlavoured Milk Added!");
																		break;
																		case 4: System.out.println("\nEnter the quantity:");
																				flavoured_quantity=Integer.parseInt(venki.readLine());
																				tot_flavour=flavoured_quantity*90;
																				System.out.println("\nFlavoured Milk Added!");
																		break;
																		default: System.out.println("\nINVALID CHOICE")
																	}
															break;
															case 2: System.out.println("\nChoose the amount:\n1.250ml - 10/-\n2.500ml - 30/-\n3.850ml - 65/-\n4.1L - 90/-");
																	flavour_lit=Integer.parseInt(venki.readLine());
																	switch(flavour_lit)
																	{
																		case 1: System.out.println("\nEnter the quantity:");
																				flavoured_quantity=Integer.parseInt(venki.readLine());
																				tot_flavour=flavoured_quantity*10;
																				System.out.println("\nFlavoured Milk Added!");
																		break;
																		case 2: System.out.println("\nEnter the quantity:");
																				flavoured_quantity=Integer.parseInt(venki.readLine());
																				tot_flavour=flavoured_quantity*30;
																				System.out.println("\nFlavoured Milk Added!");
																		break;
																		case 3: System.out.println("\nEnter the quantity:");
																				flavoured_quantity=Integer.parseInt(venki.readLine());
																				tot_flavour=flavoured_quantity*65;
																				System.out.println("\nFlavoured Milk Added!");
																		break;
																		case 4: System.out.println("\nEnter the quantity:");
																				flavoured_quantity=Integer.parseInt(venki.readLine());
																				tot_flavour=flavoured_quantity*90;
																				System.out.println("\nFlavoured Milk Added!");
																		break;
																		default: System.out.println("\nINVALID CHOICE")
																	}
															break;
															case 3: System.out.println("\nChoose the amount:\n1.250ml - 10/-\n2.500ml - 30/-\n3.850ml - 65/-\n4.1L - 90/-");
																	flavour_lit=Integer.parseInt(venki.readLine());
																	switch(flavour_lit)
																	{
																		case 1: System.out.println("\nEnter the quantity:");
																				flavoured_quantity=Integer.parseInt(venki.readLine());
																				tot_flavour=flavoured_quantity*10;
																				System.out.println("\nFlavoured Milk Added!");
																		break;
																		case 2: System.out.println("\nEnter the quantity:");
																				flavoured_quantity=Integer.parseInt(venki.readLine());
																				tot_flavour=flavoured_quantity*30;
																				System.out.println("\nFlavoured Milk Added!");
																		break;
																		case 3: System.out.println("\nEnter the quantity:");
																				flavoured_quantity=Integer.parseInt(venki.readLine());
																				tot_flavour=flavoured_quantity*65;
																				System.out.println("\nFlavoured Milk Added!");
																		break;
																		case 4: System.out.println("\nEnter the quantity:");
																				flavoured_quantity=Integer.parseInt(venki.readLine());
																				tot_flavour=flavoured_quantity*90;
																				System.out.println("\nFlavoured Milk Added!");
																		break;
																		default: System.out.println("\nINVALID CHOICE")
																	}
															break;
															case 4: System.out.println("\nChoose the amount:\n1.250ml - 10/-\n2.500ml - 30/-\n3.850ml - 65/-\n4.1L - 90/-");
																	flavour_lit=Integer.parseInt(venki.readLine());
																	switch(flavour_lit)
																	{
																		case 1: System.out.println("\nEnter the quantity:");
																				flavoured_quantity=Integer.parseInt(venki.readLine());
																				tot_flavour=flavoured_quantity*10;
																				System.out.println("\nFlavoured Milk Added!");
																		break;
																		case 2: System.out.println("\nEnter the quantity:");
																				flavoured_quantity=Integer.parseInt(venki.readLine());
																				tot_flavour=flavoured_quantity*30;
																				System.out.println("\nFlavoured Milk Added!");
																		break;
																		case 3: System.out.println("\nEnter the quantity:");
																				flavoured_quantity=Integer.parseInt(venki.readLine());
																				tot_flavour=flavoured_quantity*65;
																				System.out.println("\nFlavoured Milk Added!");
																		break;
																		case 4: System.out.println("\nEnter the quantity:");
																				flavoured_quantity=Integer.parseInt(venki.readLine());
																				tot_flavour=flavoured_quantity*90;
																				System.out.println("\nFlavoured Milk Added!");
																		break;
																		default: System.out.println("\nINVALID CHOICE")
																	}
															break;
															case 5: System.out.println("\nChoose the amount:\n1.250ml - 10/-\n2.500ml - 30/-\n3.850ml - 65/-\n4.1L - 90/-");
																	flavour_lit=Integer.parseInt(venki.readLine());
																	switch(flavour_lit)
																	{
																		case 1: System.out.println("\nEnter the quantity:");
																				flavoured_quantity=Integer.parseInt(venki.readLine());
																				tot_flavour=flavoured_quantity*10;
																				System.out.println("\nFlavoured Milk Added!");
																		break;
																		case 2: System.out.println("\nEnter the quantity:");
																				flavoured_quantity=Integer.parseInt(venki.readLine());
																				tot_flavour=flavoured_quantity*30;
																				System.out.println("\nFlavoured Milk Added!");
																		break;
																		case 3: System.out.println("\nEnter the quantity:");
																				flavoured_quantity=Integer.parseInt(venki.readLine());
																				tot_flavour=flavoured_quantity*65;
																				System.out.println("\nFlavoured Milk Added!");
																		break;
																		case 4: System.out.println("\nEnter the quantity:");
																				flavoured_quantity=Integer.parseInt(venki.readLine());
																				tot_flavour=flavoured_quantity*90;
																				System.out.println("\nFlavoured Milk Added!");
																		break;
																		default: System.out.println("\nINVALID CHOICE")
																	}
															break;
															case 6: System.out.println("\nChoose the amount:\n1.250ml - 10/-\n2.500ml - 30/-\n3.850ml - 65/-\n4.1L - 90/-");
																	flavour_lit=Integer.parseInt(venki.readLine());
																	switch(flavour_lit)
																	{
																		case 1: System.out.println("\nEnter the quantity:");
																				flavoured_quantity=Integer.parseInt(venki.readLine());
																				tot_flavour=flavoured_quantity*10;
																				System.out.println("\nFlavoured Milk Added!");
																		break;
																		case 2: System.out.println("\nEnter the quantity:");
																				flavoured_quantity=Integer.parseInt(venki.readLine());
																				tot_flavour=flavoured_quantity*30;
																				System.out.println("\nFlavoured Milk Added!");
																		break;
																		case 3: System.out.println("\nEnter the quantity:");
																				flavoured_quantity=Integer.parseInt(venki.readLine());
																				tot_flavour=flavoured_quantity*65;
																				System.out.println("\nFlavoured Milk Added!");
																		break;
																		case 4: System.out.println("\nEnter the quantity:");
																				flavoured_quantity=Integer.parseInt(venki.readLine());
																				tot_flavour=flavoured_quantity*90;
																				System.out.println("\nFlavoured Milk Added!");
																		break;
																		default: System.out.println("\nINVALID CHOICE")
																	}
															break;
															default:System.out.println("\nINVALID CHOICE!");
														}
												break;
												case 5: System.out.println("\nChoose the flavour:\n1.Mango\n2.Orange\n3.Apple\n4.Pista\n5.Strawberry\n6.Sweet Lime");
														int flavour=Integer.parseInt(venki.readLine());
														switch(flavour)
														{
															case 1: System.out.println("\nChoose the amount:\n1.250ml - 10/-\n2.500ml - 30/-\n3.850ml - 65/-\n4.1L - 90/-");
																	flavour_lit=Integer.parseInt(venki.readLine());
																	switch(flavour_lit)
																	{
																		case 1: System.out.println("\nEnter the quantity:");
																				flavoured_quantity=Integer.parseInt(venki.readLine());
																				tot_flavour=flavoured_quantity*10;
																				System.out.println("\nFlavoured Milk Added!");
																		break;
																		case 2: System.out.println("\nEnter the quantity:");
																				flavoured_quantity=Integer.parseInt(venki.readLine());
																				tot_flavour=flavoured_quantity*30;
																				System.out.println("\nFlavoured Milk Added!");
																		break;
																		case 3: System.out.println("\nEnter the quantity:");
																				flavoured_quantity=Integer.parseInt(venki.readLine());
																				tot_flavour=flavoured_quantity*65;
																				System.out.println("\nFlavoured Milk Added!");
																		break;
																		case 4: System.out.println("\nEnter the quantity:");
																				flavoured_quantity=Integer.parseInt(venki.readLine());
																				tot_flavour=flavoured_quantity*90;
																				System.out.println("\nFlavoured Milk Added!");
																		break;
																		default: System.out.println("\nINVALID CHOICE")
																	}
															break;
															case 2: System.out.println("\nChoose the amount:\n1.250ml - 10/-\n2.500ml - 30/-\n3.850ml - 65/-\n4.1L - 90/-");
																	flavour_lit=Integer.parseInt(venki.readLine());
																	switch(flavour_lit)
																	{
																		case 1: System.out.println("\nEnter the quantity:");
																				flavoured_quantity=Integer.parseInt(venki.readLine());
																				tot_flavour=flavoured_quantity*10;
																				System.out.println("\nFlavoured Milk Added!");
																		break;
																		case 2: System.out.println("\nEnter the quantity:");
																				flavoured_quantity=Integer.parseInt(venki.readLine());
																				tot_flavour=flavoured_quantity*30;
																				System.out.println("\nFlavoured Milk Added!");
																		break;
																		case 3: System.out.println("\nEnter the quantity:");
																				flavoured_quantity=Integer.parseInt(venki.readLine());
																				tot_flavour=flavoured_quantity*65;
																				System.out.println("\nFlavoured Milk Added!");
																		break;
																		case 4: System.out.println("\nEnter the quantity:");
																				flavoured_quantity=Integer.parseInt(venki.readLine());
																				tot_flavour=flavoured_quantity*90;
																				System.out.println("\nFlavoured Milk Added!");
																		break;
																		default: System.out.println("\nINVALID CHOICE")
																	}
															break;
															case 3: System.out.println("\nChoose the amount:\n1.250ml - 10/-\n2.500ml - 30/-\n3.850ml - 65/-\n4.1L - 90/-");
																	flavour_lit=Integer.parseInt(venki.readLine());
																	switch(flavour_lit)
																	{
																		case 1: System.out.println("\nEnter the quantity:");
																				flavoured_quantity=Integer.parseInt(venki.readLine());
																				tot_flavour=flavoured_quantity*10;
																				System.out.println("\nFlavoured Milk Added!");
																		break;
																		case 2: System.out.println("\nEnter the quantity:");
																				flavoured_quantity=Integer.parseInt(venki.readLine());
																				tot_flavour=flavoured_quantity*30;
																				System.out.println("\nFlavoured Milk Added!");
																		break;
																		case 3: System.out.println("\nEnter the quantity:");
																				flavoured_quantity=Integer.parseInt(venki.readLine());
																				tot_flavour=flavoured_quantity*65;
																				System.out.println("\nFlavoured Milk Added!");
																		break;
																		case 4: System.out.println("\nEnter the quantity:");
																				flavoured_quantity=Integer.parseInt(venki.readLine());
																				tot_flavour=flavoured_quantity*90;
																				System.out.println("\nFlavoured Milk Added!");
																		break;
																		default: System.out.println("\nINVALID CHOICE")
																	}
															break;
															case 4: System.out.println("\nChoose the amount:\n1.250ml - 10/-\n2.500ml - 30/-\n3.850ml - 65/-\n4.1L - 90/-");
																	flavour_lit=Integer.parseInt(venki.readLine());
																	switch(flavour_lit)
																	{
																		case 1: System.out.println("\nEnter the quantity:");
																				flavoured_quantity=Integer.parseInt(venki.readLine());
																				tot_flavour=flavoured_quantity*10;
																				System.out.println("\nFlavoured Milk Added!");
																		break;
																		case 2: System.out.println("\nEnter the quantity:");
																				flavoured_quantity=Integer.parseInt(venki.readLine());
																				tot_flavour=flavoured_quantity*30;
																				System.out.println("\nFlavoured Milk Added!");
																		break;
																		case 3: System.out.println("\nEnter the quantity:");
																				flavoured_quantity=Integer.parseInt(venki.readLine());
																				tot_flavour=flavoured_quantity*65;
																				System.out.println("\nFlavoured Milk Added!");
																		break;
																		case 4: System.out.println("\nEnter the quantity:");
																				flavoured_quantity=Integer.parseInt(venki.readLine());
																				tot_flavour=flavoured_quantity*90;
																				System.out.println("\nFlavoured Milk Added!");
																		break;
																		default: System.out.println("\nINVALID CHOICE")
																	}
															break;
															case 5: System.out.println("\nChoose the amount:\n1.250ml - 10/-\n2.500ml - 30/-\n3.850ml - 65/-\n4.1L - 90/-");
																	flavour_lit=Integer.parseInt(venki.readLine());
																	switch(flavour_lit)
																	{
																		case 1: System.out.println("\nEnter the quantity:");
																				flavoured_quantity=Integer.parseInt(venki.readLine());
																				tot_flavour=flavoured_quantity*10;
																				System.out.println("\nFlavoured Milk Added!");
																		break;
																		case 2: System.out.println("\nEnter the quantity:");
																				flavoured_quantity=Integer.parseInt(venki.readLine());
																				tot_flavour=flavoured_quantity*30;
																				System.out.println("\nFlavoured Milk Added!");
																		break;
																		case 3: System.out.println("\nEnter the quantity:");
																				flavoured_quantity=Integer.parseInt(venki.readLine());
																				tot_flavour=flavoured_quantity*65;
																				System.out.println("\nFlavoured Milk Added!");
																		break;
																		case 4: System.out.println("\nEnter the quantity:");
																				flavoured_quantity=Integer.parseInt(venki.readLine());
																				tot_flavour=flavoured_quantity*90;
																				System.out.println("\nFlavoured Milk Added!");
																		break;
																		default: System.out.println("\nINVALID CHOICE")
																	}
															break;
															case 6: System.out.println("\nChoose the amount:\n1.250ml - 10/-\n2.500ml - 30/-\n3.850ml - 65/-\n4.1L - 90/-");
																	flavour_lit=Integer.parseInt(venki.readLine());
																	switch(flavour_lit)
																	{
																		case 1: System.out.println("\nEnter the quantity:");
																				flavoured_quantity=Integer.parseInt(venki.readLine());
																				tot_flavour=flavoured_quantity*10;
																				System.out.println("\nFlavoured Milk Added!");
																		break;
																		case 2: System.out.println("\nEnter the quantity:");
																				flavoured_quantity=Integer.parseInt(venki.readLine());
																				tot_flavour=flavoured_quantity*30;
																				System.out.println("\nFlavoured Milk Added!");
																		break;
																		case 3: System.out.println("\nEnter the quantity:");
																				flavoured_quantity=Integer.parseInt(venki.readLine());
																				tot_flavour=flavoured_quantity*65;
																				System.out.println("\nFlavoured Milk Added!");
																		break;
																		case 4: System.out.println("\nEnter the quantity:");
																				flavoured_quantity=Integer.parseInt(venki.readLine());
																				tot_flavour=flavoured_quantity*90;
																				System.out.println("\nFlavoured Milk Added!");
																		break;
																		default: System.out.println("\nINVALID CHOICE")
																	}
															break;
															default:System.out.println("\nINVALID CHOICE!");
														}
												break;
												default:System.out.println("\nINVALID CHOICE!");
											}
									break;
								}
						break;
				tot_flavoured_milk+=tot_flavour;
						case 6: System.out.println("\nChoose the dry fruit:\n1.Cashew\n2.Almond\n3.Dates\n4.Pista\n5.Raisins\n6.Anjeer\n7.Apricot\n8.Seasme Seeds");
								int dry_fruits=Integer.parseInt(venki.readLine());
								switch(dry_fruits)
								{
									case 1: System.out.println("\nChoose your quantity:\n1.250g - 100/-\n2.500g- 250/-\n3.750g 400/-\n4.1Kg -650/-\n5.2Kg - 1300/-\n6.3Kg - 2600/-");
											dry_fruits_quantity=Integer.parseInt(venki.readLine());
											switch(dry_fruits_quantity)
											{
												case 1: System.out.prinln("\nEnter the number of Packets:");
														dry_quantity=Integer.parseInt(venki.readLine());
														tot_dry=dry_quantity*100;
														System.out.prinln("\nDry Fruit Added!");
												break;
												case 2: System.out.prinln("\nEnter the number of Packets:");
														dry_quantity=Integer.parseInt(venki.readLine());
														tot_dry=dry_quantity*250;
														System.out.prinln("\nDry Fruit Added!");
												break;
												case 3: System.out.prinln("\nEnter the number of Packets:");
														dry_quantity=Integer.parseInt(venki.readLine());
														tot_dry=dry_quantity*400;
														System.out.prinln("\nDry Fruit Added!");
												break;
												case 4: System.out.prinln("\nEnter the number of Packets:");
														dry_quantity=Integer.parseInt(venki.readLine());
														tot_dry=dry_quantity*650;
														System.out.prinln("\nDry Fruit Added!");
												break;
												case 5: System.out.prinln("\nEnter the number of Packets:");
														dry_quantity=Integer.parseInt(venki.readLine());
														tot_dry=dry_quantity*1300;
														System.out.prinln("\nDry Fruit Added!");
												break;
												case 6: System.out.prinln("\nEnter the number of Packets:");
														dry_quantity=Integer.parseInt(venki.readLine());
														tot_dry=dry_quantity*2600;
														System.out.prinln("\nDry Fruit Added!");
												break;
												default: System.out.prinln("\nINVALID CHOICE!");
											}
									break;
									case 2: System.out.println("\nChoose your quantity:\n1.250g - 90/-\n2.500g - 200/-\n3.750g - 375/-\n4.1Kg - 590/-\n5.2Kg - 1180/-\n6.3Kg - 2360/-");
											dry_fruits_quantity=Integer.parseInt(venki.readLine());
											switch(dry_fruits_quantity)
											{
												case 1: System.out.prinln("\nEnter the number of Packets:");
														dry_quantity=Integer.parseInt(venki.readLine());
														tot_dry=dry_quantity*90;
														System.out.prinln("\nDry Fruit Added!");
												break;
												case 2: System.out.prinln("\nEnter the number of Packets:");
														dry_quantity=Integer.parseInt(venki.readLine());
														tot_dry=dry_quantity*200;
														System.out.prinln("\nDry Fruit Added!");
												break;
												case 3: System.out.prinln("\nEnter the number of Packets:");
														dry_quantity=Integer.parseInt(venki.readLine());
														tot_dry=dry_quantity*375;
														System.out.prinln("\nDry Fruit Added!");
												break;
												case 4: System.out.prinln("\nEnter the number of Packets:");
														dry_quantity=Integer.parseInt(venki.readLine());
														tot_dry=dry_quantity*590;
														System.out.prinln("\nDry Fruit Added!");
												break;
												case 5: System.out.prinln("\nEnter the number of Packets:");
														dry_quantity=Integer.parseInt(venki.readLine());
														tot_dry=dry_quantity*1180;
														System.out.prinln("\nDry Fruit Added!");
												break;
												case 6: System.out.prinln("\nEnter the number of Packets:");
														dry_quantity=Integer.parseInt(venki.readLine());
														tot_dry=dry_quantity*2360;
														System.out.prinln("\nDry Fruit Added!");
												break;
												default: System.out.prinln("\nINVALID CHOICE!");
											}
									break;
									case 3: System.out.println("\nChoose your quantity:\n1.250g - 100/-\n2.500g- 250/-\n3.750g 400/-\n4.1Kg -650/-\n5.2Kg - 1300/-\n6.3Kg - 2600/-");
											dry_fruits_quantity=Integer.parseInt(venki.readLine());
											switch(dry_fruits_quantity)
											{
												case 1: System.out.prinln("\nEnter the number of Packets:");
														dry_quantity=Integer.parseInt(venki.readLine());
														tot_dry=dry_quantity*100;
														System.out.prinln("\nDry Fruit Added!");
												break;
												case 2: System.out.prinln("\nEnter the number of Packets:");
														dry_quantity=Integer.parseInt(venki.readLine());
														tot_dry=dry_quantity*250;
														System.out.prinln("\nDry Fruit Added!");
												break;
												case 3: System.out.prinln("\nEnter the number of Packets:");
														dry_quantity=Integer.parseInt(venki.readLine());
														tot_dry=dry_quantity*400;
														System.out.prinln("\nDry Fruit Added!");
												break;
												case 4: System.out.prinln("\nEnter the number of Packets:");
														dry_quantity=Integer.parseInt(venki.readLine());
														tot_dry=dry_quantity*650;
														System.out.prinln("\nDry Fruit Added!");
												break;
												case 5: System.out.prinln("\nEnter the number of Packets:");
														dry_quantity=Integer.parseInt(venki.readLine());
														tot_dry=dry_quantity*1300;
														System.out.prinln("\nDry Fruit Added!");
												break;
												case 6: System.out.prinln("\nEnter the number of Packets:");
														dry_quantity=Integer.parseInt(venki.readLine());
														tot_dry=dry_quantity*2600;
														System.out.prinln("\nDry Fruit Added!");
												break;
												default: System.out.prinln("\nINVALID CHOICE!");
											}
									break;
									case 4: System.out.println("\nEnter The Quantity:\n1.250g - 60/-\n2.500g 110/-\n3.750g - 175/-\n4.1Kg 320/-\n5.2Kg - 640/-\n6.3Kg - 960/-");
											dry_fruits_quantity=Integer.parseInt(venki.readLine());
											switch(dry_fruits_quantity)
											{
												case 1: System.out.println("\nEnter the Number of Packets:");
														dry_quantity=Integer.parseInt(venki.readLine());
														tot_dry=dry_quantity*60;
														System.out.println("\nDry Fruit Added!");
												break;
												case 2: System.out.println("\nEnter the Quantity:");
														dry_quantity=Integer.parseInt(venki.readLine());
														tot_dry=dry_quantity*110;
														System.out.println("\nDry Fruit Added!");
												break;
												case 3: System.out.println("\nEnter the Quantity:");
														dry_quantity=Integer.parseInt(venki.readLine());
														tot_dry=dry_quantity*175;
														System.out.println("\nDry Fruit Added!");
												break;
												case 4: System.out.println("\nEnter the Quantity:");
														dry_quantity=Integer.parseInt(venki.readLine());
														tot_dry=dry_quantity*320;
														System.out.println("\nDry Fruit Added!");
												break;
												case 4: System.out.println("\nEnter the Quantity:");
														dry_quantity=Integer.parseInt(venki.readLine());
														tot_dry=dry_quantity*640;
														System.out.println("\nDry Fruit Added!");
												break;
												case 5: System.out.println("\nEnter the Quantity:");
														dry_quantity=Integer.parseInt(venki.readLine());
														tot_dry=dry_quantity*960;
														System.out.println("\nDry Fruit Added!");
												break;
												default: System.out.println("\nINVALID CHOICE!");
											}
									break;
									case 5: System.out.println("\nEnter The Quantity:\n1.250g - 75/-\n2.500g - 150/-\n3.750g - 230/-\n4.1Kg - 310/-\n5.2Kg - 620\n6.3Kg - 930/-");
											dry_fruits_quantity=Integer.paresInt(venki.readLine());
											switch(dry_fruits_quantity)
											{
												case 1: System.out.println("\nEnter the Number of Packets:");
														dry_fruits=Integer.parseInt(venki.readLine());
														tot_dry_fruits=dry_fruits*75;
														System.out.println("\nDry Fruit Added!");
												break;
												case 2: System.out.println("\nEnter the Number of Packets:");
														dry_fruits=Integer.parseInt(venki.readLine());
														tot_dry_fruits=dry_fruits*150;
														System.out.println("\nDry Fruit Added!");
												break;
												case 3: System.out.println("\nEnter the Number of Packets:");
														dry_fruits=Integer.parseInt(venki.readLine());
														tot_dry_fruits=dry_fruits*230;
														System.out.println("\nDry Fruit Added!");
												break;
												case 4: System.out.println("\nEnter the Number of Packets:");
														dry_fruits=Integer.parseInt(venki.readLine());
														tot_dry_fruits=dry_fruits*310;
														System.out.println("\nDry Fruit Added!");
												break;
												case 5: System.out.println("\nEnter the Number of Packets:");
														dry_fruits=Integer.parseInt(venki.readLine());
														tot_dry_fruits=dry_fruits*620;
														System.out.println("\nDry Fruit Added!");
												break;
												case 6: System.out.println("\nEnter the Number of Packets:");
														dry_fruits=Integer.parseInt(venki.readLine());
														tot_dry_fruits=dry_fruits*930;
														System.out.println("\nDry Fruit Added!");
												break;
												default: System.out.println("\nINVALID CHOICE!");
											}
									break;
									case 6 System.out.println("\nEnter The Quantity:\n1.250g - 175/-\n2.500g - 450/-\n3.750g - 230/-\n4.1Kg - 310/-\n5.2Kg - 620\n6.3Kg - 930/-");
											dry_fruits_quantity=Integer.paresInt(venki.readLine());
											switch(dry_fruits_quantity)
											{
												case 1: System.out.println("\nEnter the Number of Packets:");
														dry_fruits=Integer.parseInt(venki.readLine());
														tot_dry_fruits=dry_fruits*175;
														System.out.println("\nDry Fruit Added!");
												break;
												case 2: System.out.println("\nEnter the Number of Packets:");
														dry_fruits=Integer.parseInt(venki.readLine());
														tot_dry_fruits=dry_fruits*450;
														System.out.println("\nDry Fruit Added!");
												break;
												case 3: System.out.println("\nEnter the Number of Packets:");
														dry_fruits=Integer.parseInt(venki.readLine());
														tot_dry_fruits=dry_fruits*230;
														System.out.println("\nDry Fruit Added!");
												break;
												case 4: System.out.println("\nEnter the Number of Packets:");
														dry_fruits=Integer.parseInt(venki.readLine());
														tot_dry_fruits=dry_fruits*310;
														System.out.println("\nDry Fruit Added!");
												break;
												case 5: System.out.println("\nEnter the Number of Packets:");
														dry_fruits=Integer.parseInt(venki.readLine());
														tot_dry_fruits=dry_fruits*620;
														System.out.println("\nDry Fruit Added!");
												break;
												case 6: System.out.println("\nEnter the Number of Packets:");
														dry_fruits=Integer.parseInt(venki.readLine());
														tot_dry_fruits=dry_fruits*930;
														System.out.println("\nDry Fruit Added!");
												break;
												default: System.out.println("\nINVALID CHOICE!");
											}
									break;

								}
					}
				}
			}
		} while                                //Condition to checkout 
	}                                          //closing the main 
}	                                            //Closing the class 