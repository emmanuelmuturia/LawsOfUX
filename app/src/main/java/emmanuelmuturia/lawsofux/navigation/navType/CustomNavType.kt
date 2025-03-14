package emmanuelmuturia.lawsofux.navigation.navType

import android.net.Uri
import android.os.Bundle
import androidx.navigation.NavType
import emmanuelmuturia.lawsofux.home.data.model.UXLaw
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json

object CustomNavType {
    val uxLawType =
        object : NavType<UXLaw>(
            isNullableAllowed = false,
        ) {
            override fun get(
                bundle: Bundle,
                key: String,
            ): UXLaw? {
                return Json.decodeFromString(string = bundle.getString(key) ?: return null)
            }

            override fun parseValue(value: String): UXLaw {
                return Json.decodeFromString(string = Uri.decode(value))
            }

            override fun serializeAsValue(value: UXLaw): String {
                return Uri.encode(Json.encodeToString(value = value))
            }

            override fun put(
                bundle: Bundle,
                key: String,
                value: UXLaw,
            ) {
                bundle.putString(key, Json.encodeToString(value = value))
            }
        }
}