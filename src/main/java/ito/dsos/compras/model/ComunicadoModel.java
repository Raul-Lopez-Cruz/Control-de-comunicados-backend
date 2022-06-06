package ito.dsos.compras.model;

import javax.persistence.*;

@Entity
@Table(name = "ComunicadoModel")
public class ComunicadoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idComunicado", nullable = false, updatable = false, length = 10)
    private Integer idComunicado;

    @Column(name = "fecha", nullable = false)
    private String fecha;

    @Column(name = "titulo", nullable = false)
    private String titulo;

    @Column(name = "descripcion", nullable = false)
    private String descripcion;

    @Column(name = "tipo", nullable = false)
    private String tipo;

    @Column(name = "estado", nullable = false)
    private String estado;

    @Column(name = "Creador", nullable = false)
    private String creador;

    @Lob
    @Column(name = "imagen")
    private byte[] imagen;

    public byte[] getImagen() {
        return imagen;
    }

    public void setImagen(byte[] imagen) {
        this.imagen = imagen;
    }

    public ComunicadoModel() {
    }

    public ComunicadoModel(Integer idComunicado, String fecha, String titulo, String descripcion, String tipo, String estado, String creador, byte[] imagen) {
        this.idComunicado = idComunicado;
        this.fecha = fecha;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.tipo = tipo;
        this.estado = estado;
        this.creador = creador;
        this.imagen = imagen;
    }

    public Integer getIdComunicado() {
        return idComunicado;
    }

    public void setIdComunicado(Integer idComunicado) {
        this.idComunicado = idComunicado;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCreador() {
        return creador;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    public void setMensagem(String mensagem) {
    }
}
