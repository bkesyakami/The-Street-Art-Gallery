//Imports
import java.awt.Color
import java.awt.Dimension
import java.awt.Graphics
import javax.swing.JFrame
import javax.swing.JPanel

//Constants
const val WIDTH = 900
const val HEIGHT = 600

//Classes
class ArtPiece(val color: Color, val width: Int, val height: Int) {
    fun draw(g: Graphics){
        g.color = color
        g.fillRect(0, 0, width, height)
    }
}

class Gallery(val frameName: String, val background: Color) : JFrame() {

    private val pieces = mutableListOf<ArtPiece>()

    init {
        title = frameName
    }

    //Add ArtPiece
    fun addPiece(piece: ArtPiece){
        pieces.add(piece)
    }

    //create
    fun create(){
        defaultCloseOperation = EXIT_ON_CLOSE
        setSize(WIDTH, HEIGHT)
        isVisible = true
    }

}

class Canvas : JPanel() {
    override fun paintComponent(g: Graphics) {
        //Remove background
        g.color = Color.WHITE
        g.fillRect(0, 0, width, height)
    }
}

//Main Function
fun main() {
    
    //Create Canvas
    val canvas = Canvas()
    canvas.preferredSize = Dimension(WIDTH, HEIGHT)
    canvas.background = Color.WHITE

    //Create Gallery
    val gallery = Gallery("The Street Art Gallery", Color.BLACK)
    gallery.add(canvas)

    //Create ArtPiece
    val artPiece1 = ArtPiece(Color.RED, 200, 300)
    val artPiece2 = ArtPiece(Color.BLUE, 500, 500)

    //Add to Gallery
    gallery.addPiece(artPiece1)
    gallery.addPiece(artPiece2)

    //Create
    gallery.create()

}