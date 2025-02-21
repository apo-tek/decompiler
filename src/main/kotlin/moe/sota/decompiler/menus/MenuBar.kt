package moe.sota.decompiler.menus

import com.formdev.flatlaf.extras.components.FlatMenuBar
import moe.sota.decompiler.menus.file.File
import moe.sota.decompiler.menus.help.Help

class MenuBar : FlatMenuBar() {

    init {
        add(File())
        add(Help())
    }

}