/**************************************************************************
 *  This file is part of the Doode Android project                        *
 *  Copyright (C) 2012 Eduardo Weiland                                    *
 *  duduweiland@users.sourceforge.net                                     *
 *                                                                        *
 *  This program is free software: you can redistribute it and/or modify  *
 *  it under the terms of the GNU General Public License as published by  *
 *  the Free Software Foundation, either version 3 of the License, or     *
 *  (at your option) any later version.                                   *
 *                                                                        *
 *  This program is distributed in the hope that it will be useful,       *
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of        *
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the         *
 *  GNU General Public License for more details.                          *
 *                                                                        *
 *  You should have received a copy of the GNU General Public License     *
 *  along with this program.  If not, see <http://www.gnu.org/licenses/>  *
 **************************************************************************/

package net.doode.android;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Activity class for viewing and replying to mentions.
 * 
 * @author Eduardo Weiland
 */
public class MentionsFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup group,
            Bundle saved) {
        return inflater.inflate(R.layout.update_status, group, false);
    }

}
