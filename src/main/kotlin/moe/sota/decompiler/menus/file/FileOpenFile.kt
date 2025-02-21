package moe.sota.decompiler.menus.file

import com.formdev.flatlaf.extras.components.FlatMenuItem
import moe.sota.decompiler.controllers.WindowController
import moe.sota.decompiler.services.LanguageService
import moe.sota.decompiler.services.LoaderService
import java.awt.Toolkit
import java.awt.event.ActionEvent
import java.awt.event.ActionListener
import java.awt.event.KeyEvent
import javax.swing.JFileChooser
import javax.swing.KeyStroke
import javax.swing.filechooser.FileNameExtensionFilter

class FileOpenFile : FlatMenuItem(), ActionListener {

    private val translation = LanguageService.getTranslation("file.openFile")

    init {
        accelerator = KeyStroke.getKeyStroke(KeyEvent.VK_O, Toolkit.getDefaultToolkit().menuShortcutKeyMaskEx)
        mnemonic = KeyEvent.VK_O
        text = "$translation..."
        addActionListener(this)
    }

    override fun actionPerformed(p0: ActionEvent?) {
        val fileChooser = JFileChooser().apply {
            isAcceptAllFileFilterUsed = false
            dialogTitle = translation
            fileFilter = FileNameExtensionFilter("Java (*.jar;*.war;*.zip)", "jar", "war", "zip")
        }
        fileChooser.showOpenDialog(WindowController.view)
        if (fileChooser.selectedFile != null)
            LoaderService.loadAsync(fileChooser.selectedFile)
    }

}