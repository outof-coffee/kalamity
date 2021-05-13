package coffee.outof.kalamity

import com.jme3.app.SimpleApplication
import com.jme3.material.Material
import com.jme3.math.ColorRGBA
import com.jme3.math.Vector3f
import com.jme3.scene.Geometry
import com.jme3.scene.Node
import com.jme3.scene.shape.Box
import com.jme3.system.AppSettings

class Main : SimpleApplication() {

    companion object {
        @JvmStatic fun main(args : Array<String>) {
            Main().apply {
                settings = AppSettings(true).apply {
                    title = "My Awesome Game"
                }
            }.start()
        }
    }

    override fun simpleInitApp() {
        val pivot = Node("pivot").apply {
            attachChild(Geometry("Box", Box(1F,1F,1F)).apply {
                localTranslation = Vector3f(1F,1F,1F)
                material = Material(assetManager, "Common/MatDefs/Misc/Unshaded.j3md").apply {
                    setColor("Color", ColorRGBA.Blue)
                }
            })
            attachChild(Geometry("Box", Box(1F,1F,1F)).apply {
                localTranslation = Vector3f(1F, 3F, 1F)
                material = Material(assetManager, "Common/MatDefs/Misc/Unshaded.j3md").apply {
                    setColor("Color", ColorRGBA.Red)
                }
            })
        }
        rootNode.attachChild(pivot)
        pivot.rotate(.4F, .4F, 0F)
    }

    override fun simpleUpdate(tpf : Float) {
        // add update code
    }

}