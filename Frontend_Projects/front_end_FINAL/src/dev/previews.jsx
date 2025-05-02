import React from 'react'
import {ComponentPreview, Previews} from '@react-buddy/ide-toolbox'
import {PaletteTree} from './palette'
import RentalForm from "../components/RentalForm";

const ComponentPreviews = () => {
    return (
        <Previews palette={<PaletteTree/>}>
            <ComponentPreview path="/RentalForm">
                <RentalForm/>
            </ComponentPreview>
        </Previews>
    )
}

export default ComponentPreviews