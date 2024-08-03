import java.util.List;
import  java.util.*;

public class Main {

    public static void main(String[] args) {

        Hospede hospede1 = new Hospede();

        hospede1.nome = "Juliana Mendes";
        hospede1.cpf = "907.753.764-21";
        hospede1.telefone = "(86) 9-8765-0743";
       //hospede1.nquarto = 15;

        Reserva reserva = new Reserva();
        reserva.status = true;
        hospede1.reserva = reserva;

        ArrayList<Hospede> hospedes = new ArrayList();
        hospedes.add(hospede1);

        if(reserva.status == true){

            System.out.println("reservado");
            //reserva.andar();

        }else{

            System.out.println("quarto indisponível");
            //(colocar loop)

        }

        int tam = hospedes.size();
        for (int i = 0; i < tam; i++){

            System.out.println(hospedes.get(i));
        }


    }
}
