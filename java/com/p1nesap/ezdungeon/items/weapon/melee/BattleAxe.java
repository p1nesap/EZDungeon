/*
 * Pixel Dungeon
 * Copyright (C) 2012-2014  Oleg Dolya
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>
 */
package com.p1nesap.ezdungeon.items.weapon.melee;

import com.p1nesap.ezdungeon.sprites.ItemSpriteSheet;

public class BattleAxe extends MeleeWeapon {

	{
		name = "battle axe";
		image = ItemSpriteSheet.BATTLE_AXE;
	}
	
	public BattleAxe() {
		super( 4, 1.2f, 1f );
	}
	
	@Override
	public String desc() {
		return "The enormous steel head of this battle axe puts considerable heft behind each stroke.";
	}
}
