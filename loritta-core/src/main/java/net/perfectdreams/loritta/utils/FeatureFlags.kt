package net.perfectdreams.loritta.utils

import com.mrpowergamerbr.loritta.utils.loritta

object FeatureFlags {
	const val NEW_WEBSITE_PORT = "new-website-port"
	const val MEMBER_COUNTER_UPDATE = "member-counter-update"
	const val ALLOW_MORE_THAN_ONE_COUNTER_FOR_PREMIUM_USERS = "allow-more-than-one-counter-for-premium-users"
	const val BOTS_CAN_HAVE_FUN_IN_THE_RAFFLE_TOO = "bots-can-have-fun-in-the-raffle-too"
	const val WRECK_THE_RAFFLE_STOP_THE_WHALES = "wreck-the-raffle"

	fun isEnabled(name: String): Boolean {
		return loritta.config.loritta.featureFlags.contains(name)
	}
}