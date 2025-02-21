package moe.sota.decompiler.menus.file

import com.formdev.flatlaf.extras.components.FlatMenu
import moe.sota.decompiler.services.LanguageService
import java.awt.event.KeyEvent
import javax.swing.JSeparator

class File : FlatMenu() {

    init {
        mnemonic = KeyEvent.VK_F
        text = LanguageService.getTranslation("file")

        add(FileOpenFile())
        add(FileCloseTab)
        add(JSeparator())
        add(FileNewInstance())
        add(FileExit())
    }

}