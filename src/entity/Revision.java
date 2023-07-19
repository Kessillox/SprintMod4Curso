package entity;

/**
 * Clase Revisión
 * @author AlfaOmega (Katherine)
 */
public class Revision {
        private int id;
        private VisitaTerreno visitaTerrenoID;
        private String tipoRevision;
        private String detalle;
        private int estado;

        public Revision() {
        }

        public Revision(int id, VisitaTerreno visitaTerrenoID, String tipoRevision, String detalle, int estado) {
            this.id = id;
            this.visitaTerrenoID = visitaTerrenoID;
            this.tipoRevision = tipoRevision;
            this.detalle = detalle;
            this.estado = estado;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }


        public VisitaTerreno getVisitaTerrenoID() {
            return visitaTerrenoID;
        }

        public void setVisitaTerrenoID(VisitaTerreno visitaTerrenoID) {
            this.visitaTerrenoID = visitaTerrenoID;
        }


        public String getTipoRevision() {
            return tipoRevision;
        }

        public void setTipoRevision(String tipoRevision) {
            this.tipoRevision = tipoRevision;
        }


        public String getDetalle() {
            return detalle;
        }

        public void setDetalle(String detalle) {
            this.detalle = detalle;
        }


        public int getEstado() {
            return estado;
        }

        public void setEstado(int estado) {
            this.estado = estado;
        }

        @Override
        public String toString() {
            return "Revision{" +
                    "id=" + id +
                    ", visitaTerrenoID=" + visitaTerrenoID.getIdVisita() +
                    ", tipoRevision='" + tipoRevision + '\'' +
                    ", detalle='" + detalle + '\'' +
                    ", estado=" + estado +
                    '}';
        }
    }



