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

plugins {
    `kotlin-dsl`
}

repositories {
    google()
    jcenter()
    mavenCentral()
    maven(url = "https://jitpack.io")
    maven(url = "https://oss.sonatype.org/content/repositories/snapshots/")
    maven(url = "https://plugins.gradle.org/m2/")
}