package com.smushytaco.expanded_bow_enchanting.configuration_support
import com.smushytaco.expanded_bow_enchanting.ExpandedBowEnchanting
import me.shedaniel.autoconfig.ConfigData
import me.shedaniel.autoconfig.annotation.Config
import me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson.Comment
@Config(name = ExpandedBowEnchanting.MOD_ID)
class ModConfiguration: ConfigData {
    @Comment("Default value is true. If set to true you'll be able to mix infinity and mending on a bow. If set to false you won't be able to.")
    val infinityAndMendingCanBeMixed = true
    @Comment("Default value is true. If set to true you'll be able to use Looting on a bow. If set to false you won't be able to.")
    val canUseLootingOnBow = true
}