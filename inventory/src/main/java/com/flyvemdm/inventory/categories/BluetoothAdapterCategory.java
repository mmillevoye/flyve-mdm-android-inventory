/**
 * FusionInventory
 *
 * Copyright (C) 2010-2017 by the FusionInventory Development Team.
 *
 * http://www.fusioninventory.org/
 * https://github.com/fusioninventory/fusioninventory-android
 *
 * ------------------------------------------------------------------------
 *
 * LICENSE
 *
 * This file is part of FusionInventory project.
 *
 * FusionInventory is free software: you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * FusionInventory is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * ------------------------------------------------------------------------------
 * @update    07/06/2017
 * @license   GPLv2 https://www.gnu.org/licenses/old-licenses/gpl-2.0.html
 * @link      https://github.com/fusioninventory/fusioninventory-android
 * @link      http://www.fusioninventory.org/
 * ------------------------------------------------------------------------------
 */

package com.flyvemdm.inventory.categories;

import android.bluetooth.BluetoothAdapter;
import android.content.Context;

public class BluetoothAdapterCategory
        extends Categories {

    /**
     * 
     */
    private static final long serialVersionUID = 3252750764653173048L;

    public BluetoothAdapterCategory(Context xCtx) {
        super(xCtx);
        // TODO Auto-generated constructor stub
        
        Category c = new Category(mCtx, "BLUETOOTH_ADAPTER");
        
        BluetoothAdapter adapter = BluetoothAdapter.getDefaultAdapter();
        c.put("HMAC" , adapter.getAddress());
        c.put("NAME" , adapter.getName());

        this.add(c);

    }

}
