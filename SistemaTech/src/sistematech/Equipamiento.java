/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistematech;

/**
 *
 * @author Susanna
 */
public class Equipamiento {
        private int id;
            private int proyector;
            private int sistVideo;

public Equipamiento (int id, int proyector, int sistVideo){
            this.id = id;
            this.proyector=proyector;
            this.sistVideo=sistVideo;
            

}

    // M�todos getter para obtener informaci�n del equipamiento
    public int getId() {
        return id;
    }

    public int getProyector() {
        return proyector;
    }

    public int getSistVideo() {
        return sistVideo;
    }

    // M�todos setter para modificar el equipamiento
    public void setProyector(int proyector) {
        this.proyector = proyector;
    }

    public void setSistVideo(int sistVideo) {
        this.sistVideo = sistVideo;
    }

    
}
