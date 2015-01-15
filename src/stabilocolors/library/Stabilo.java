/**
 * Stabilo Colors
 * A Processing library returning all available Stabilo 68/88 colors.
 * http://www.rbdgt.be
 *
 * Copyright 2015 Robin De Groote
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 * 
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General
 * Public License along with this library; if not, write to the
 * Free Software Foundation, Inc., 59 Temple Place, Suite 330,
 * Boston, MA  02111-1307  USA
 * 
 * @author      Robin De Groote
 * @modified    15/01/2015
 * @version     1.0 (1.0.0)
 */

package stabilocolors.library;

import processing.core.*;

public class Stabilo {

	// myParent is a reference to the parent sketch
	PApplet parent;

	private int iceblue_11;
	private int icegreen_13;
	private int lightemerald_16;
	private int heliotrope_17;
	private int purple_19;
	private int nightblue_22;
	private int lemonyellow_24;
	private int apricot_26;
	private int pink_29;
	private int palevermillion_30;
	private int lightblue_31;
	private int ultramarine_32;
	private int applegreen_33;
	private int green_36;
	private int sanguine_38;
	private int red_40;
	private int darkblue_41;
	private int leafgreen_43;
	private int yellow_44;
	private int brown_45;
	private int black_46;
	private int carmine_48;
	private int crimsonred_50;
	private int turquoise_51;
	private int pinegreen_53;
	private int orange_54;
	private int violet_55;
	private int rose_56;
	private int azureblue_57;
	private int lilac_58;
	private int lightlilac_59;
	private int olivegreen_63;
	private int umber_65;
	private int sienna_75;
	private int lightochre_88;
	private int darkochre_89;
	private int lightgrey_94;
	private int mediumgrey_95;
	private int darkgrey_96;
	private int deepgrey_97;
	private int paynesgrey_98;

	public final static String VERSION = "1.0.0";

	public Stabilo(PApplet theParent) {
		parent = theParent;
		// parent.registerMethod("dispose", this);
		welcome();
		initColors();
	}

	private void welcome() {
		System.out.println("Stabilo Colors 1.0.0 by Robin De Groote");
	}

	public int s88(int color) {
		switch (color) {
		case 13:
			return icegreen_13;
		case 22:
			return nightblue_22;
		case 26:
			return apricot_26;
		case 32:
			return ultramarine_32;
		case 33:
			return applegreen_33;
		case 36:
			return green_36;
		case 40:
			return red_40;
		case 41:
			return darkblue_41;
		case 43:
			return leafgreen_43;
		case 44:
			return yellow_44;
		case 45:
			return brown_45;
		case 46:
			return black_46;
		case 50:
			return crimsonred_50;
		case 51:
			return turquoise_51;
		case 53:
			return pinegreen_53;
		case 54:
			return orange_54;
		case 55:
			return violet_55;
		case 56:
			return rose_56;
		case 57:
			return azureblue_57;
		case 58:
			return lilac_58;
		case 59:
			return lightlilac_59;
		case 63:
			return olivegreen_63;
		case 89:
			return darkochre_89;
		case 94:
			return lightgrey_94;
		case 96:
			return darkgrey_96;
		default:
			badcolor("Stabilo 88");
			return parent.color(255, 255, 255, 0);
		}
	}

	public int s88(String color) {
		switch (color) {
		case "ice_green":
			return icegreen_13;
		case "night_blue":
			return nightblue_22;
		case "apricot":
			return apricot_26;
		case "ultramarine":
			return ultramarine_32;
		case "apple_green":
			return applegreen_33;
		case "green":
			return green_36;
		case "red":
			return red_40;
		case "dark_blue":
			return darkblue_41;
		case "leaf_green":
			return leafgreen_43;
		case "yellow":
			return yellow_44;
		case "brown":
			return brown_45;
		case "black":
			return black_46;
		case "crimson_red":
			return crimsonred_50;
		case "turquoise":
			return turquoise_51;
		case "pine_green":
			return pinegreen_53;
		case "orange":
			return orange_54;
		case "violet":
			return violet_55;
		case "rose":
			return rose_56;
		case "azure_blue":
			return azureblue_57;
		case "lilac":
			return lilac_58;
		case "light_lilac":
			return lightlilac_59;
		case "olive_green":
			return olivegreen_63;
		case "dark_ochre":
			return darkochre_89;
		case "light_grey":
			return lightgrey_94;
		case "dark_grey":
			return darkgrey_96;
		default:
			badcolor("Stabilo 88");
			return parent.color(255, 255, 255, 0);
		}
	}

	public int s68(int color) {
		switch (color) {
		case 11:
			return iceblue_11;
		case 13:
			return icegreen_13;
		case 16:
			return lightemerald_16;
		case 17:
			return heliotrope_17;
		case 19:
			return purple_19;
		case 22:
			return nightblue_22;
		case 24:
			return lemonyellow_24;
		case 26:
			return apricot_26;
		case 29:
			return pink_29;
		case 30:
			return palevermillion_30;
		case 31:
			return lightblue_31;
		case 32:
			return ultramarine_32;
		case 33:
			return applegreen_33;
		case 36:
			return green_36;
		case 38:
			return sanguine_38;
		case 40:
			return red_40;
		case 41:
			return darkblue_41;
		case 43:
			return leafgreen_43;
		case 44:
			return yellow_44;
		case 45:
			return brown_45;
		case 46:
			return black_46;
		case 48:
			return carmine_48;
		case 50:
			return crimsonred_50;
		case 51:
			return turquoise_51;
		case 53:
			return pinegreen_53;
		case 54:
			return orange_54;
		case 55:
			return violet_55;
		case 56:
			return rose_56;
		case 57:
			return azureblue_57;
		case 58:
			return lilac_58;
		case 59:
			return lightlilac_59;
		case 63:
			return olivegreen_63;
		case 65:
			return umber_65;
		case 75:
			return sienna_75;
		case 88:
			return lightochre_88;
		case 89:
			return darkochre_89;
		case 94:
			return lightgrey_94;
		case 95:
			return mediumgrey_95;
		case 96:
			return darkgrey_96;
		case 97:
			return deepgrey_97;
		case 98:
			return paynesgrey_98;
		default:
			badcolor("Stabilo 68");
			return parent.color(255, 255, 255, 0);
		}
	}

	public int s68(String color) {
		switch (color) {
		case "ice_blue":
			return iceblue_11;
		case "ice_green":
			return icegreen_13;
		case "light_emerald":
			return lightemerald_16;
		case "heliotrope":
			return heliotrope_17;
		case "purple":
			return purple_19;
		case "night_blue":
			return nightblue_22;
		case "lemon_yellow":
			return lemonyellow_24;
		case "apricot":
			return apricot_26;
		case "pink":
			return pink_29;
		case "pale_vermillion":
			return palevermillion_30;
		case "light_blue":
			return lightblue_31;
		case "ultramarine":
			return ultramarine_32;
		case "apple_green":
			return applegreen_33;
		case "green":
			return green_36;
		case "sanguine":
			return sanguine_38;
		case "red":
			return red_40;
		case "dark_blue":
			return darkblue_41;
		case "leaf_green":
			return leafgreen_43;
		case "yellow":
			return yellow_44;
		case "brown":
			return brown_45;
		case "black":
			return black_46;
		case "carmine":
			return carmine_48;
		case "crimson_red":
			return crimsonred_50;
		case "turquoise":
			return turquoise_51;
		case "pine_green":
			return pinegreen_53;
		case "orange":
			return orange_54;
		case "violet":
			return violet_55;
		case "rose":
			return rose_56;
		case "azure_blue":
			return azureblue_57;
		case "lilac":
			return lilac_58;
		case "light_lilac":
			return lightlilac_59;
		case "olive_green":
			return olivegreen_63;
		case "umber":
			return umber_65;
		case "sienna":
			return sienna_75;
		case "light_ochre":
			return lightochre_88;
		case "dark_ochre":
			return darkochre_89;
		case "light_grey":
			return lightgrey_94;
		case "medium_grey":
			return mediumgrey_95;
		case "dark_grey":
			return darkgrey_96;
		case "deep_grey":
			return deepgrey_97;
		case "paynes_grey":
			return paynesgrey_98;
		default:
			badcolor("Stabilo 68");
			return parent.color(255, 255, 255, 0);
		}
	}

	public String getColorName(int colorCode) {
		switch (colorCode) {
		case 11:
			return "ice_blue";
		case 13:
			return "ice_green";
		case 16:
			return "light_emerald";
		case 17:
			return "heliotrope";
		case 19:
			return "purple";
		case 22:
			return "night_blue";
		case 24:
			return "lemon_yellow";
		case 26:
			return "apricot";
		case 29:
			return "pink";
		case 30:
			return "pale_vermillion";
		case 31:
			return "light_blue";
		case 32:
			return "ultramarine";
		case 33:
			return "apple_green";
		case 36:
			return "green";
		case 38:
			return "sanguine";
		case 40:
			return "red";
		case 41:
			return "dark_blue";
		case 43:
			return "leaf_green";
		case 44:
			return "yellow";
		case 45:
			return "brown";
		case 46:
			return "black";
		case 48:
			return "carmine";
		case 50:
			return "crimson_red";
		case 51:
			return "turquoise";
		case 53:
			return "pine_green";
		case 54:
			return "orange";
		case 55:
			return "violet";
		case 56:
			return "rose";
		case 57:
			return "azure_blue";
		case 58:
			return "lilac";
		case 59:
			return "light_lilac";
		case 63:
			return "olive_green";
		case 65:
			return "umber";
		case 75:
			return "sienna";
		case 88:
			return "light_ochre";
		case 89:
			return "dark_ochre";
		case 94:
			return "light_grey";
		case 95:
			return "medium_grey";
		case 96:
			return "dark_grey";
		case 97:
			return "deep_grey";
		case 98:
			return "paynes_grey";
		default:
			return "NO_COLOR";
		}
	}

	public int getColorCode(String colorName) {
		switch (colorName) {
		case "ice_blue":
			return 11;
		case "ice_green":
			return 13;
		case "light_emerald":
			return 16;
		case "heliotrope":
			return 17;
		case "purple":
			return 19;
		case "night_blue":
			return 22;
		case "lemon_yellow":
			return 24;
		case "apricot":
			return 26;
		case "pink":
			return 29;
		case "pale_vermillion":
			return 30;
		case "light_blue":
			return 31;
		case "ultramarine":
			return 32;
		case "apple_green":
			return 33;
		case "green":
			return 36;
		case "sanguine":
			return 38;
		case "red":
			return 40;
		case "dark_blue":
			return 41;
		case "leaf_green":
			return 43;
		case "yellow":
			return 44;
		case "brown":
			return 45;
		case "black":
			return 46;
		case "carmine":
			return 48;
		case "crimson_red":
			return 50;
		case "turquoise":
			return 51;
		case "pine_green":
			return 53;
		case "orange":
			return 54;
		case "violet":
			return 55;
		case "rose":
			return 56;
		case "azure_blue":
			return 57;
		case "lilac":
			return 58;
		case "light_lilac":
			return 59;
		case "olive_green":
			return 63;
		case "umber":
			return 65;
		case "sienna":
			return 75;
		case "light_ochre":
			return 88;
		case "dark_ochre":
			return 89;
		case "light_grey":
			return 94;
		case "medium_grey":
			return 95;
		case "dark_grey":
			return 96;
		case "deep_grey":
			return 97;
		case "paynes_grey":
			return 98;
		default:
			return 0;
		}
	}

	private void badcolor(String pentype) {
		System.out.println("Colorcode doesn't exist for the " + pentype + " pen.");
	}

	private void initColors() {
		iceblue_11 = parent.color(173, 211, 234);
		icegreen_13 = parent.color(41, 182, 166);
		lightemerald_16 = parent.color(138, 188, 129);
		heliotrope_17 = parent.color(196, 130, 176);
		purple_19 = parent.color(132, 28, 65);
		nightblue_22 = parent.color(15, 30, 95);
		lemonyellow_24 = parent.color(236, 233, 76);
		apricot_26 = parent.color(246, 174, 149);
		pink_29 = parent.color(203, 118, 141);
		palevermillion_30 = parent.color(194, 89, 42);
		lightblue_31 = parent.color(37, 120, 190);
		ultramarine_32 = parent.color(0, 135, 203);
		applegreen_33 = parent.color(160, 189, 0);
		green_36 = parent.color(0, 142, 70);
		sanguine_38 = parent.color(149, 52, 45);
		red_40 = parent.color(223, 1, 22);
		darkblue_41 = parent.color(0, 67, 148);
		leafgreen_43 = parent.color(113, 183, 58);
		yellow_44 = parent.color(255, 204, 1);
		brown_45 = parent.color(102, 65, 36);
		black_46 = parent.color(0, 20, 27);
		carmine_48 = parent.color(175, 18, 29);
		crimsonred_50 = parent.color(206, 0, 65);
		turquoise_51 = parent.color(0, 155, 177);
		pinegreen_53 = parent.color(0, 87, 68);
		orange_54 = parent.color(239, 123, 0);
		violet_55 = parent.color(85, 36, 127);
		rose_56 = parent.color(227, 21, 130);
		azureblue_57 = parent.color(0, 187, 218);
		lilac_58 = parent.color(165, 0, 123);
		lightlilac_59 = parent.color(188, 152, 196);
		olivegreen_63 = parent.color(53, 94, 50);
		umber_65 = parent.color(76, 63, 47);
		sienna_75 = parent.color(94, 61, 44);
		lightochre_88 = parent.color(178, 141, 73);
		darkochre_89 = parent.color(194, 96, 23);
		lightgrey_94 = parent.color(185, 201, 214);
		mediumgrey_95 = parent.color(130, 137, 147);
		darkgrey_96 = parent.color(103, 115, 131);
		deepgrey_97 = parent.color(58, 63, 69);
		paynesgrey_98 = parent.color(27, 50, 84);
	}

	public static String version() {
		return VERSION;
	}
}
