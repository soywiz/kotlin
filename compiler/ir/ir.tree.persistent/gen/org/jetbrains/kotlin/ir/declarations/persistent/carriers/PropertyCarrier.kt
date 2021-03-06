/*
 * Copyright 2010-2021 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.ir.declarations.persistent.carriers

import org.jetbrains.kotlin.ir.declarations.IrDeclarationOrigin
import org.jetbrains.kotlin.ir.declarations.IrField
import org.jetbrains.kotlin.ir.declarations.IrSimpleFunction
import org.jetbrains.kotlin.ir.expressions.IrConstructorCall
import org.jetbrains.kotlin.ir.symbols.IrFieldSymbol
import org.jetbrains.kotlin.ir.symbols.IrSimpleFunctionSymbol
import org.jetbrains.kotlin.ir.symbols.IrSymbol

// Auto-generated by compiler/ir/ir.tree.persistent/generator/src/org/jetbrains/kotlin/ir/persistentIrGenerator/Main.kt. DO NOT EDIT!

internal interface PropertyCarrier : DeclarationCarrier{
    val backingFieldField: IrField?
    val backingFieldSymbolField: IrFieldSymbol?
    val getterField: IrSimpleFunction?
    val getterSymbolField: IrSimpleFunctionSymbol?
    val setterField: IrSimpleFunction?
    val setterSymbolField: IrSimpleFunctionSymbol?

    override fun clone(): PropertyCarrier {
        return PropertyCarrierImpl(
            lastModified,
            parentSymbolField,
            originField,
            annotationsField,
            backingFieldSymbolField,
            getterSymbolField,
            setterSymbolField
        )
    }
}

internal class PropertyCarrierImpl(
    override val lastModified: Int,
    override val parentSymbolField: IrSymbol?,
    override val originField: IrDeclarationOrigin,
    override val annotationsField: List<IrConstructorCall>,
    override val backingFieldSymbolField: IrFieldSymbol?,
    override val getterSymbolField: IrSimpleFunctionSymbol?,
    override val setterSymbolField: IrSimpleFunctionSymbol?
) : PropertyCarrier {

    override val backingFieldField: IrField?
        get() = backingFieldSymbolField?.owner

    override val getterField: IrSimpleFunction?
        get() = getterSymbolField?.owner

    override val setterField: IrSimpleFunction?
        get() = setterSymbolField?.owner
}
