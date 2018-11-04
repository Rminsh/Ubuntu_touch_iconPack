/*
 * Copyright (C) 2018 Armin Shalchian
 *
 * This work is licensed under the Creative Commons Attribution-NonCommercial 4.0 International License.
 * To view a copy of this license, visit http://creativecommons.org/licenses/by-nc/4.0/.
 */

package co.aseman.ubuntuTouchIcons

import com.github.javiersantos.piracychecker.PiracyChecker
import jahirfiquitiva.libs.blueprint.models.NavigationItem
import jahirfiquitiva.libs.blueprint.ui.activities.BottomNavigationBlueprintActivity

class MainActivity : BottomNavigationBlueprintActivity() {

    override var donationsEnabled = true

    override fun amazonInstallsEnabled(): Boolean = false
    override fun checkLPF(): Boolean = false
    override fun checkStores(): Boolean = false

    /**
     * This is your app's license key. Get yours on Google Play Dev Console.
     * Default one isn't valid and could cause issues in your app.
     */
    override fun getLicKey(): String? = ""

    /**
     * This is the license checker code. Feel free to create your own implementation or
     * leave it as it is.
     * Anyways, keep the 'destroyChecker()' as the very first line of this code block
     * Return null to disable license check
     */
    override fun getLicenseChecker(): PiracyChecker? {
        return null
    }

    /**
     * These are the main items that will be shown in the navigation drawer or bottom navigation.
     * Remove the ones you don't want to show.
     * You can also organize them however you want.
     * Templates (Zooper & Kustom), Credits, Settings and Help sections are added by default. So don't worry about those.
     */
    override fun getNavigationItems(): Array<NavigationItem> {
        return arrayOf(
            NavigationItem.HOME,
            NavigationItem.ICONS,
            NavigationItem.WALLPAPERS,
            NavigationItem.APPLY,
            NavigationItem.REQUESTS)
    }

    /**
     * When set to true, the app will print warnings for duplicated components or missing icons from
     * appfilter.xml
     *
     * If set to BuildConfig.DEBUG, the app will print the warnings only while debugging the app
     * (This is the safest option, so the apk you publish in PlayStore doesn't print them)
     */
    override fun debug(): Boolean = BuildConfig.DEBUG
}
