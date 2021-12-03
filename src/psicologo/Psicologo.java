
package psicologo;

public class Psicologo {
        public static void main(String[] args) {
            
            agenda agendita = new agenda (5,6);
            /*
            Paciente pacientito1 = new Paciente ("Lucia", true, 50);
            Paciente pacientito2 = new Paciente ("Pepe", true, 510);
            Paciente pacientito3 = new Paciente ("Marcos", false, 450);
            Paciente pacientito4 = new Paciente ("Trolo", true, 250);
            Paciente pacientito5 = new Paciente ("Penocho", true, 5000);
            Paciente pacientito6 = new Paciente ("Laura", false, 510);
            Paciente pacientito7 = new Paciente ("Papagato", true, 340);
            Paciente pacientito8 = new Paciente ("Mirtha", true, 690);
            Paciente pacientito9 = new Paciente ("Pure", true, 2710);
            Paciente pacientito10 = new Paciente ("Pipina", false, 980);
            
            
            agendita.agendarTurno(pacientito1, 1, 2);
            agendita.agendarTurno(pacientito2, 2, 3);
            agendita.agendarTurno(pacientito3, 5, 3);
            agendita.agendarTurno(pacientito4, 4, 2);
            agendita.agendarTurno(pacientito5, 4, 1);
            agendita.agendarTurno(pacientito6, 3, 2);
            agendita.agendarTurno(pacientito7, 4, 5);
            agendita.agendarTurno(pacientito8, 3, 1);
            agendita.agendarTurno(pacientito9, 5, 2);
            agendita.agendarTurno(pacientito10, 5, 1);
            
            System.out.println(agendita.buscarSiEstaAgendado(1,"Lucia"));
            agendita.liberarTurno("Lucia");
            System.out.println(agendita.buscarSiEstaAgendado(1,"Lucia"));
            
            
            */
            
            /* este es para el parcial 2 */
            
            
            Paciente paciente1 = new Paciente ("Pepe", true, 50);
            Paciente paciente2 = new Paciente ("Pepe", true, 510);
            Paciente paciente3 = new Paciente ("Marcos", false, 450);
            Paciente paciente4 = new Paciente ("Trolo", true, 250);
            Paciente paciente5 = new Paciente ("Pepe", true, 250);
            Paciente paciente6 = new Paciente ("Trolo", true, 250);
            Paciente paciente7 = new Paciente ("Trolo", true, 250);
            
            System.out.println("El dia asignado es: " + agendita.agendarDiaYRetornar(paciente1, 2));
            System.out.println("El dia asignado es: " + agendita.agendarDiaYRetornar(paciente2, 3));
            System.out.println("El dia asignado es: " + agendita.agendarDiaYRetornar(paciente3, 3));
            System.out.println("El dia asignado es: " + agendita.agendarDiaYRetornar(paciente4, 2));
            System.out.println("El dia asignado es: " + agendita.agendarDiaYRetornar(paciente5, 1));
            System.out.println("El dia asignado es: " + agendita.agendarDiaYRetornar(paciente6, 1));
            System.out.println("El dia asignado es: " + agendita.agendarDiaYRetornar(paciente7, 3));
            
            
            System.out.println("La cantidad de turnos reservados por Pepe es de: " + agendita.devolverCantidadTurnos("Pepe"));
            agendita.liberarTurnoEspecifico(1, "Pepe");
            System.out.println("La cantidad de turnos reservados por Pepe es de: " + agendita.devolverCantidadTurnos("Pepe"));
    }
    
}
