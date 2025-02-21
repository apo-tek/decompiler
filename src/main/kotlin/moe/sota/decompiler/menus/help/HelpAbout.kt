package moe.sota.decompiler.menus.help

import com.formdev.flatlaf.extras.components.FlatMenuItem
import moe.sota.decompiler.controllers.AboutController
import moe.sota.decompiler.services.LanguageService
import java.awt.Desktop
import java.awt.event.ActionEvent
import java.awt.event.ActionListener
import java.awt.event.KeyEvent

class HelpAbout : FlatMenuItem(), ActionListener {

    init {
        mnemonic = KeyEvent.VK_A
        text = LanguageService.getTranslation("about")
        addActionListener(this)

        if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Desktop.Action.APP_ABOUT))
            Desktop.getDesktop().setAboutHandler { actionPerformed(null) }
    }

    override fun actionPerformed(p0: ActionEvent?) {
        AboutController().show()
    }

}