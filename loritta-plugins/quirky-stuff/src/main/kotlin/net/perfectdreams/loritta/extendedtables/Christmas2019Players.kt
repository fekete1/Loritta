package net.perfectdreams.loritta.tables

import com.mrpowergamerbr.loritta.tables.Profiles
import org.jetbrains.exposed.dao.LongIdTable

object Christmas2019Players : LongIdTable() {
	val user = reference("user", Profiles)
}