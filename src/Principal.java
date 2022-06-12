
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.Timer;


public class Principal extends javax.swing.JFrame 
{
    Final fin;
    JLabel letra[][];
    JLabel palabra[];
    String palabras[];//almacena las palabras en un arreglo de string
    int iniciox[];
    int inicioy[];
    boolean gano; 
    boolean direccion[];
    public Principal() 
    {
        initComponents();
        t = new Timer(10, acciones);
        palabra = new JLabel[]{p1,p2,p3,p4,p5,p6,p7,p8,p9,p10};
        this.setLocationRelativeTo(null);
        cargar();
        palabras=new String[10];
        palabra=new JLabel[]{p1,p2,p3,p4,p5,p6,p7,p8,p9,p10};//
        for (int i = 0; i < letra.length; i++) {
            palabras[i]=palabra[i].getText();//pasa la palabra del arreglo label al al arreglo de string
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        etiquetaTiempo = new javax.swing.JLabel();
        btnStart = new javax.swing.JButton();
        btnStop = new javax.swing.JButton();
        escritorio = new javax.swing.JDesktopPane();
        SopaLetras = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        p2 = new javax.swing.JLabel();
        p1 = new javax.swing.JLabel();
        p4 = new javax.swing.JLabel();
        p3 = new javax.swing.JLabel();
        p6 = new javax.swing.JLabel();
        p5 = new javax.swing.JLabel();
        p8 = new javax.swing.JLabel();
        p7 = new javax.swing.JLabel();
        p9 = new javax.swing.JLabel();
        p10 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("SOPA DE LETRAS");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("PALABRAS");

        etiquetaTiempo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiquetaTiempo.setText("00:00:00:00");

        btnStart.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        btnStart.setText("Iniciar");
        btnStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStartActionPerformed(evt);
            }
        });

        btnStop.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        btnStop.setText("Detener");
        btnStop.setEnabled(false);
        btnStop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStopActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(btnStart, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnStop)
                .addGap(19, 19, 19)
                .addComponent(etiquetaTiempo, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(etiquetaTiempo)
                .addComponent(btnStart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnStop))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 590, -1));

        escritorio.setBackground(new java.awt.Color(204, 204, 255));

        SopaLetras.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        SopaLetras.setLayout(new java.awt.GridLayout(10, 14));

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        p2.setBackground(new java.awt.Color(0, 204, 255));
        p2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p2.setText("OBJETO");
        p2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        p2.setOpaque(true);

        p1.setBackground(new java.awt.Color(0, 204, 255));
        p1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p1.setText("VARIABLES");
        p1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        p1.setOpaque(true);

        p4.setBackground(new java.awt.Color(0, 204, 255));
        p4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p4.setText("COMPILAR");
        p4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        p4.setOpaque(true);

        p3.setBackground(new java.awt.Color(0, 204, 255));
        p3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p3.setText("JAVA");
        p3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        p3.setOpaque(true);

        p6.setBackground(new java.awt.Color(0, 204, 255));
        p6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p6.setText("CHAR");
        p6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        p6.setOpaque(true);

        p5.setBackground(new java.awt.Color(0, 204, 255));
        p5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p5.setText("DATOS");
        p5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        p5.setOpaque(true);

        p8.setBackground(new java.awt.Color(0, 204, 255));
        p8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p8.setText("ENTRADA");
        p8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        p8.setOpaque(true);

        p7.setBackground(new java.awt.Color(0, 204, 255));
        p7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p7.setText("JRE");
        p7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        p7.setOpaque(true);

        p9.setBackground(new java.awt.Color(0, 204, 255));
        p9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p9.setText("STRING");
        p9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        p9.setOpaque(true);

        p10.setBackground(new java.awt.Color(0, 204, 255));
        p10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p10.setText("INTEGER");
        p10.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        p10.setOpaque(true);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(p7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(p6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(p5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(p10, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(p8, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(p4, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(p3, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(p1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(p9, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(p2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(p1)
                .addGap(18, 18, 18)
                .addComponent(p2)
                .addGap(18, 18, 18)
                .addComponent(p3)
                .addGap(18, 18, 18)
                .addComponent(p4)
                .addGap(18, 18, 18)
                .addComponent(p5)
                .addGap(18, 18, 18)
                .addComponent(p6)
                .addGap(18, 18, 18)
                .addComponent(p7)
                .addGap(18, 18, 18)
                .addComponent(p8)
                .addGap(18, 18, 18)
                .addComponent(p9)
                .addGap(18, 18, 18)
                .addComponent(p10)
                .addContainerGap())
        );

        escritorio.setLayer(SopaLetras, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(jPanel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(escritorioLayout.createSequentialGroup()
                .addComponent(SopaLetras, javax.swing.GroupLayout.PREFERRED_SIZE, 449, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(escritorioLayout.createSequentialGroup()
                .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(SopaLetras, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 30, Short.MAX_VALUE))
        );

        getContentPane().add(escritorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 36, 588, 396));

        jMenu1.setText("Reiniciar");
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private Timer t;
    private int h, m, s, cs;
    private ActionListener acciones = new ActionListener(){

        @Override
        public void actionPerformed(ActionEvent ae) {
            ++cs; 
            if(cs==100){
                cs = 0;
                ++s;
            }
            if(s==60) 
            {
                s = 0;
                ++m;
            }
            if(m==60)
            {
                m = 0;
                ++h;
            }
            actualizarLabel();
        }
        
    };
    
    private void actualizarLabel() {
        String tiempo = (h<=9?"0":"")+h+":"+(m<=9?"0":"")+m+":"+(s<=9?"0":"")+s+":"+(cs<=9?"0":"")+cs;
        etiquetaTiempo.setText(tiempo);
        if (tiempo.contains("00:20:00:00")) { //Aqui se asigna el valor en tiempo al que se requiere se detenga el juego
            if(t.isRunning()) 
        {
            t.stop();
            btnStart.setEnabled(true);
        }
        btnStart.setText("Iniciar");
        btnStop.setEnabled(false);
        h=0; m=0; s=0; cs=0;
        actualizarLabel();
        
        for (int i = 0; i < letra.length; i++) {
            palabra[i].setText(palabras[i]);//asigna a los label de la derecha las palabras
        }
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 14; j++) {
                SopaLetras.remove(letra[i][j]);//quita el panel  Sopa_de_letra
            }
        }
        cargar();//carga el juego
        }
    }
    
    private void btnStartActionPerformed(java.awt.event.ActionEvent evt) {                                         
        t.start();
        btnStart.setEnabled(false);
        btnStart.setText("Reanudar");
        btnStop.setEnabled(true);
        
        for (int i = 0; i < letra.length; i++) {
            palabra[i].setText(palabras[i]);//asigna a los label de la derecha las palabras
        }
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 14; j++) {
                SopaLetras.remove(letra[i][j]);//quita el panel  Sopa_de_letra
            }
        }
        cargar();//carga el juego
    }                                        
                                 

    private void btnStopActionPerformed(java.awt.event.ActionEvent evt) {                                        
        if(t.isRunning()) 
        {
            t.stop();
            btnStart.setEnabled(true);
        }
        btnStart.setText("Iniciar");
        btnStop.setEnabled(false);
        h=0; m=0; s=0; cs=0;
        actualizarLabel();
        
        for (int i = 0; i < letra.length; i++) {
            palabra[i].setText(palabras[i]);//asigna a los label de la derecha las palabras
        }
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 14; j++) {
                SopaLetras.remove(letra[i][j]);//quita el panel  Sopa_de_letra
            }
        }
        cargar();//carga el juego
    }
    
    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
        
        if(t.isRunning()) 
        {
            t.stop();
            btnStart.setEnabled(true);
        }
        btnStart.setText("Iniciar");
        btnStop.setEnabled(false);
        h=0; m=0; s=0; cs=0;
        actualizarLabel();

        //esta reinicia el juego
        for (int i = 0; i < letra.length; i++) {
            palabra[i].setText(palabras[i]);//asigna a los label de la derecha las palabras
        }
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 14; j++) {
                SopaLetras.remove(letra[i][j]);//quita el panel  Sopa_de_letra
            }
        }
        cargar();//carga el juego
    }//GEN-LAST:event_jMenu1MouseClicked
    
    
    public void cargar()
    {
        gano=false;
        iniciox=new int[10];//crea un arreglo de enteros para guadar las posiciones de las palabras en x
        inicioy=new int[10];//crea un arreglo de enteros para guadar las posiciones de las palabras en y
        direccion=new boolean[10];//crea un arreglo de enteros para guadar las direcion de las palabras ya sea hacia alante o hacia tras
        celdasdeletras();
        colocarpalabras();
        llenarespaciosvacios();
    }
    public void celdasdeletras() 
    {
        letra=new JLabel[10][14];//crea la matriz de celdas donde va cada letra
        for (int i = 0; i < 10; i++) 
        {
            for (int j = 0; j < 14; j++) {
                letra[i][j]=new JLabel("", javax.swing.SwingConstants.CENTER);//crea la casilla la vacia y con una alineacion centrada
                letra[i][j].setName("");//le pone un nombre a la casilla en este caso no le pone ninguno
                letra[i][j].setBackground(Color.WHITE);//coloca la casilla de color blanco
                letra[i][j].setFont(new java.awt.Font("Segoe UI Symbol", 1, 14)); // asigna el tipo y el tamaño de la letra
                letra[i][j].setForeground(new java.awt.Color(0, 5, 2));
                letra[i][j].setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
                letra[i][j].setOpaque(true);//esto es para que se pueda ver el color de la casilla o cajonsito donde va la letra
                letra[i][j].setBorder(new javax.swing.border.LineBorder(Color.BLACK, 1));//pone a la casiilla en borde con una linea negra
                letra[i][j].addMouseListener(new java.awt.event.MouseAdapter() {//pone a la casilla a la escucha del mouse para saber cuando se esta dando clic
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        presioneClic(evt);//llama al metodo que debe ejecutarse cuando se da clic
                    }
                });
                SopaLetras.add(letra[i][j]);//coloca la pasilla en el panel Sopa_de_letra
            }
        }
    }
    //este metodo se ejecuta cuando se presiona clic en una casilla
    public void presioneClic(java.awt.event.MouseEvent evt) {
        if (!gano) {//verifica si gano el juego
            if (evt.getComponent().getBackground().equals(Color.WHITE))//verifica si la casilla esta de color blanco 
            {
                evt.getComponent().setBackground(new java.awt.Color(51, 51, 255));//si esta de color blanco la pone de color azul
                tachar();
            }else if(evt.getComponent().getName().equals(""))//pregunta si la casilla no tiene una letra de alguna palabra
            {
                evt.getComponent().setBackground(Color.WHITE);//pone la casilla de color blanco
            }
        }
    }
    public void tachar() 
    {
        for (int i = 0; i < 10; i++) 
        {
            if (!palabra[i].getText().substring(0, 1).equals("<")) {
                if (tacharLetra(iniciox[i],inicioy[i],palabra[i].getText().length(),direccion[i]))//pregunta si hay una palabra encontrada
                {
                    palabra[i].setText("<html><body><s>"+palabra[i].getText()+"</s></body></html>");//tacha la palabra
                    break;
                }
            }
        }
        boolean aux=true;//ayuda para saber si ya todas las palabras estan tachadas
        for (int i = 0; i < letra.length; i++)
        {
            if (!palabra[i].getText().substring(0, 1).equals("<")) 
            {
                aux=false;
                break;
            }
        }
        if (aux) {
            if (!(fin instanceof Final)) 
            { //esto comprueba si la ventana no esta en memoria, entonces la instancia
                fin = new Final();   
                gano=true;
            } 
             t.stop();
            CentrarVentanaInterna(fin); //usamos el metodo generico para centrar
        }
    }
    public void CentrarVentanaInterna(JInternalFrame internalFrame) 
    { //pasamos como parametro un objeto de tipo JinternalFrame
        int x = (escritorio.getWidth() / 2) - internalFrame.getWidth() / 2;  //caculas las posiciones x y y 
        int y = (escritorio.getHeight() / 2) - internalFrame.getHeight() / 2;
        if (internalFrame.isShowing()) {// comprobamos si la ventana ya esta ejecutada
            internalFrame.setLocation(x, y); // si es asi solo le colocamos en la mitad
        } 
        else
        {
            escritorio.add(internalFrame); // si no es asi le insertamos dentro del desktoppane
            internalFrame.setLocation(x, y); 
            internalFrame.show(); // y mostramos
        }
    }
//    verifica si se puede tachar la letra
    public boolean  tacharLetra(int x,int y,int tamaño,boolean direccion) {
        boolean respuesta=true;
        if (direccion) {
            for (int i = y; i < tamaño+y; i++) {
                if (letra[x][i].getBackground().equals(Color.WHITE)) {
                    respuesta=false;
                    break;
                }
            }
        }else
        {
            for (int j = y; j >y-tamaño; j--) {
                if (letra[x][j].getBackground().equals(Color.WHITE)) {
                    respuesta=false;
                    break;
                }
            }
        }
        return respuesta;
    }
    public void colocarpalabras() 
    {
        String palabra[]={p1.getText(),p2.getText(),p3.getText(),p4.getText(),p5.getText(),p6.getText(),p7.getText(),p8.getText(),p9.getText(),p10.getText()};
        Random random=new Random();//estemetodo ayuda a crear numeros aleatorios
        int iniciax=0;//posicion x donde inicia la palabra
        int iniciay;//posicion y donde inicia la palabra
        int unico[]=NumerosSinRepeticiones(10);//evita que en una fila se generen mas de una vez
        iniciox=unico;
        for (int i = 0; i < palabra.length; i++) {
            if (palabra[i].length()<14) {
                iniciax=unico[i];
                iniciay=(int)(random.nextDouble()*14-1);
                int estrae=0;//ayuda para estraer las letras de la palabra
                if (iniciay+palabra[i].length()<14) {
                    for (int j = iniciay; j < iniciay+palabra[i].length(); j++) {
                        letra[iniciax][j].setText(palabra[i].substring(estrae, estrae+1));//estrae una letra de la palabra
                        letra[iniciax][j].setName("1");//pone el nombre a la casilla para que se sepa que hay va una letra de una palabra
                        estrae++;//esto es para que se estraiga la siguiente letra de la palabra
                        inicioy[i]=iniciay;
                        direccion[i]=true;
                    }
                } else if (iniciay-palabra[i].length()>0)
                {
                    for (int j = iniciay; j >iniciay-palabra[i].length() ; j--) {
                        letra[iniciax][j].setText(palabra[i].substring(estrae, estrae+1));
                        letra[iniciax][j].setName("1");
                        estrae++;
                        inicioy[i]=iniciay;
                        direccion[i]=false;
                    }
                }
            }
        }
    }
    public int[] NumerosSinRepeticiones(int repeticiones) {
        int numeros[]=new int[repeticiones];
        for (int i = 0; i < repeticiones; i++) {
            numeros[i]=-1;
        }
        Random random=new Random();
        boolean aux ;//informa si la fila esta o no repetida
        int numero=0;
        for (int x = 0; x < repeticiones; x++) 
        {
            aux = true;
            while (aux) {  
                aux=false;
                numero=(int)(random.nextDouble()*11-1);
                for (int j = 0; j < numeros.length; j++) {
                    if (numeros[j]==numero) {
                        aux=true;
                        break;
                    }
                }
            }
            numeros[x]=numero;
        }
        return numeros;
    }
    public void llenarespaciosvacios() 
    {
        //este arreglo ayuda a poner las letras del avecedario
        String abc[]={"A","B","C","D","E","F","G","H","I","J","K","L","M","N","Ñ","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
        Random random=new Random();
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 14; j++) {
                if (letra[i][j].getText().equals("")) {//si la casilla esta vacia pongale una letra del arreglo abc
                    letra[i][j].setText(abc[(int)(random.nextDouble()*abc.length-1)]);//aqui pone la letra
                }
            }
        }
    }
    
    public void countdown () {
        
    }
    
    public static void main(String args[]) 
    {
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() 
            {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    javax.swing.JPanel SopaLetras;
    javax.swing.JButton btnStart;
    javax.swing.JButton btnStop;
    javax.swing.JDesktopPane escritorio;
    javax.swing.JLabel etiquetaTiempo;
    javax.swing.JLabel jLabel1;
    javax.swing.JLabel jLabel2;
    javax.swing.JMenu jMenu1;
    javax.swing.JMenuBar jMenuBar1;
    javax.swing.JPanel jPanel2;
    javax.swing.JPanel jPanel3;
    javax.swing.JLabel p1;
    javax.swing.JLabel p10;
    javax.swing.JLabel p2;
    javax.swing.JLabel p3;
    javax.swing.JLabel p4;
    javax.swing.JLabel p5;
    javax.swing.JLabel p6;
    javax.swing.JLabel p7;
    javax.swing.JLabel p8;
    javax.swing.JLabel p9;
    // End of variables declaration//GEN-END:variables
}
