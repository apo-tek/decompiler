package moe.sota.decompiler.menus.file

import com.formdev.flatlaf.extras.components.FlatMenuItem
import moe.sota.decompiler.services.LanguageService
import moe.sota.decompiler.services.ProcessService
import java.awt.Toolkit
import java.awt.event.ActionEvent
import java.awt.event.ActionListener
import java.awt.event.KeyEvent
import javax.swing.KeyStroke

class FileNewInstance : FlatMenuItem(), ActionListener {

    init {
        accelerator = KeyStroke.getKeyStroke(KeyEvent.VK_N, Toolkit.getDefaultToolkit().menuShortcutKeyMaskEx)
        mnemonic = KeyEvent.VK_N
        text = LanguageService.getTranslation("file.newInstance")
        addActionListener(this)
    }

    override fun actionPerformed(p0: ActionEvent?) {
        ProcessService.start()
    }

}