mainMenu {
    enabled = true // Set to true to enable this module
    label {
        position {
            x = 2
            y { it - 20 }
        }
        text = literal("Nova Companion 2.5.2")
        align = "left"
        color = 0xFFFFFF
        hoveredColor = 0x6DFFFB
        shadow = true
        onClicked = url("https://novaserver.xyz/discord-mc")
    }
}