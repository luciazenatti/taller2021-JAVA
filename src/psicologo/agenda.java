/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package psicologo;

public class agenda {
    private Paciente [][] diayturno;
    private int maxDia;
    private int maxTurno;

    public agenda(int dia, int turno) {
        this.maxDia = dia;
        this.maxTurno = turno;
        this.diayturno = new Paciente [dia][turno];
    }
    
    public void agendarTurno (Paciente unPaciente, int unDia, int unTurno){
        this.diayturno[unDia-1][unTurno-1] = unPaciente;
    }
    
    public void liberarTurno (String unNombre){
        int i;
        int j;
        for (i=0; i<maxDia; i++){
            for (j=0; j<maxTurno; j++){
                if (diayturno[i][j] != null){
                    if (this.diayturno[i][j].getNombre().equals(unNombre)){
                        this.diayturno[i][j] = null;
                    }
                }
            }
        }
    }
    
    public boolean buscarSiEstaAgendado (int diaD, String unNombre){
        int j=0;
        boolean seEncontro = false;
        while (j < maxTurno){
            if (diayturno[diaD-1][j] != null){
                if (diayturno[diaD-1][j].getNombre().equals(unNombre)){
                    seEncontro = true;
                    return seEncontro;
                }
            }
            j++;
        }
        return seEncontro;
    }
    
    
    /* este es el punto 2, de todos los parciales */
    
    public int agendarDiaYRetornar (Paciente unPaciente, int turnoT){
        int i=0;
        while ((i<maxDia) & (diayturno[i][turnoT-1] != null)){
                i++;
            }
        this.diayturno[i][turnoT-1] = unPaciente;
        return i+1;
        }
    
    
    public void liberarTurnoEspecifico (int diaD, String unNombre){
        int j=0;
        while (j<maxTurno){
            if (diayturno[diaD-1][j] != null){
                if (this.diayturno[diaD-1][j].getNombre().equals(unNombre)){
                        this.diayturno[diaD-1][j] = null;
                }
            }
        j++;
        }
    }
    
    public int devolverCantidadTurnos (String unNombre){
        int i,j;
        int aux=0;
        for (i=0; i<maxDia; i++){
            for (j=0; j<maxTurno; j++){
                if (diayturno[i][j] != null){
                    if (this.diayturno[i][j].getNombre().equals(unNombre)){
                        aux++;
                    }
                }
            }
        }
        return aux;
    }
}
