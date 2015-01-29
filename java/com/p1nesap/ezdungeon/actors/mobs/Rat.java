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
package com.p1nesap.ezdungeon.actors.mobs;

import com.p1nesap.ezdungeon.actors.Char;
import com.p1nesap.ezdungeon.actors.mobs.npcs.Ghost;
import com.p1nesap.ezdungeon.sprites.RatSprite;
import com.p1nesap.utils.Random;

public class Rat extends Mob {

	{
		name = "marsupial rat";
		spriteClass = RatSprite.class;
		
		HP = HT = 2; //was 8
		defenseSkill = 1; //was 3
		
		maxLvl = 5;
	}
	
	@Override
	public int damageRoll() {
		return Random.NormalIntRange( 1, 5 );
	}
	
	@Override
	public int attackSkill( Char target ) {
		return 8;
	}
	
	@Override
	public int dr() {
		return 1;
	}
	
	@Override
	public void die( Object cause ) {
		Ghost.Quest.process( pos );
		
		super.die( cause );
	}
	
	@Override
	public String description() {
		return
			"Marsupial rats are aggressive, but rather weak denizens " +
			"of the sewers. They can be dangerous only in big numbers.";
	}
}
