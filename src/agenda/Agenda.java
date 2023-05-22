
package agenda;

public class Agenda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Primeiro instancia a lista
        ListaCircular lista = new ListaCircular();
        
        //adiciona os alguns elementos na lista
        lista.adiciona("Pedro", "11912345678", 0, "Pedro@gmail.com", "Ele é o marido da valeria");
        lista.adiciona("Antonio", "11921346587", 1, "Antonio@gmail.com", "Antonio o borracheiro");
        lista.adiciona("Valeria", "11987654321", 2, "valeria@gmail.com", "Valeria é a esposa do Pedro");
        lista.adiciona("Carlos", "11956781234", 3, "Carlos@gmail.com", "Dono do petshop");
        lista.adiciona("Julia", "11", 3, "Carlos@gmail.com", "Dono do petshop");

        // instancia a view depois de já existir a Lista
       
        JFrameAgenda menu = new JFrameAgenda(lista); 
        menu.setLista(lista);
        menu.setVisible(true);
    }

}
