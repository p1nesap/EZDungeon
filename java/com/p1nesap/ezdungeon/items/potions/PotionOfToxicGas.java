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
package com.p1nesap.ezdungeon.items.potions;

import com.p1nesap.noosa.audio.Sample;
import com.p1nesap.ezdungeon.Assets;
import com.p1nesap.ezdungeon.actors.Actor;
import com.p1nesap.ezdungeon.actors.blobs.Blob;
import com.p1nesap.ezdungeon.actors.blobs.ToxicGas;
import com.p1nesap.ezdungeon.scenes.GameScene;

public class PotionOfToxicGas extends Potion {

	{
		name = "Potion of Toxic Gas";
	}
	
	@Override
	protected void shatter( int cell ) {
		
		setKnown();
		
		splash( cell );
		Sample.INSTANCE.play( Assets.SND_SHATTER );
		
		ToxicGas gas = Blob.seed( cell, 1000, ToxicGas.class );
		Actor.add( gas );
		GameScene.add( gas );
	}
	
	@Override
	public String desc() {
		return
			"Uncorking or shattering this pressurized glass will cause " +
			"its contents to explode into a deadly cloud of toxic green gas. " +
			"You might choose to fling this potion at distant enemies " +
			"instead of uncorking it by hand.";
	}
	
	@Override
	public int price() {
		return isKnown() ? 40 * quantity : super.price();
	}
}
