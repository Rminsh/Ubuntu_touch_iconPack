/*
 *
 * This file is part of Ubuntu touch icon pack.
 *
 * Ubuntu touch icon pack is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Ubuntu touch icon pack is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with Ubuntu touch icon pack.  If not, see <https://www.gnu.org/licenses/>.
 */

package co.aseman.ubuntuTouchIcons

import com.github.javiersantos.piracychecker.PiracyChecker
import dev.jahir.blueprint.ui.activities.BottomNavigationBlueprintActivity

class MainActivity : BottomNavigationBlueprintActivity() {

    override val billingEnabled = true

    override fun amazonInstallsEnabled(): Boolean = false
    override fun checkLPF(): Boolean = true
    override fun checkStores(): Boolean = true
    override val isDebug: Boolean = BuildConfig.DEBUG

    /**
     * This is your app's license key. Get yours on Google Play Dev Console.
     * Default one isn't valid and could cause issues in your app.
     */
    override fun getLicKey(): String? = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAmYnZw/fUo2MBAoVHnDOQW8uSK6cU6vqcz+XSqkzXcjKmt9V6+hq50H3QoWdq9UmvdA4nny3h+4axgZAIl65JIQmWmBa5MhnVX0dX344IOQew/LaJ+iZat11/5a8AwSsRvEVHfjcQZfkwYI5B3mGO4HGFihfddHVHwY2Kx3u7ElybRP1N8JE8M5mkZ9DNpS27vD/SAJDABywUAsi2aetfJRz4EcNpyfWxu8295+01yhbAQu4Dp1m0zh6mwUDyVNnz4EgkDgqouQd+aUof2LxrChedx11h/9o/fIcY8jeRuQHRjoTkoZad8z44Zo7mYLf8b8Fr/TZvFVjFmoETbtWjAQIDAQAB"

    /**
     * This is the license checker code. Feel free to create your own implementation or
     * leave it as it is.
     * Anyways, keep the 'destroyChecker()' as the very first line of this code block
     * Return null to disable license check
     */
    override fun getLicenseChecker(): PiracyChecker? {
        return null
    }

    override fun defaultTheme(): Int = R.style.MyApp_Default
    override fun amoledTheme(): Int = R.style.MyApp_Default_Amoled
}