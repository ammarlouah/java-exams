import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class ExempleInterface extends Frame implements ActionListener{
    Label l1 = new Label("CNE : ");
    public TextField t1 = new TextField(20);
    Label l2 = new Label("Nom & Prenom :");
    public TextField t2 = new TextField(20);
    Button b1 = new Button("Envoyer");
    Button b2 = new Button("Annuler");
    ExempleInterface(String titre){
        super(titre);
        setLayout(new FlowLayout());
        add(l1);add(t1);add(l2);add(t2);add(b1);add(b2);
        b1.addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent e){
        // Gestion de button b1
        if(e.getSource()==b1){
            String cne,n_p,url,usr,mdp;
            cne = t1.getText();
            n_p = t2.getText();
            url = "jdbc:mysql://localhost:3306/GestionEtudiants";
            usr="root";
            mdp = "";
            try{
                Connection con = DriverManager.getConnection(url, usr, mdp);
                Statement st = con.createStatement();
                String req = "insert into Etudiant values('"+cne+"'','"+n_p+"'')";
                st.execute(req);
                con.close();
                System.out.println("Ok");
            }catch(SQLException ee){
                System.err.println(ee.getMessage());
            }
        }
    }
}
