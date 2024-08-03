public class Hospede {  Reserva reserva;

    String nome;
    String cpf;
    String telefone;

    public String CadastroHospede() {
        return "Hospede{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", telefone='" + telefone + '\'' +
                ", reserva=" + reserva +
                '}';
    }

}
