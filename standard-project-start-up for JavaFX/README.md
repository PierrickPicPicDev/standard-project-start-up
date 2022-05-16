# standard project start-up for JavaFX

JavaFX
https://openjfx.io/openjfx-docs/#IDE-Intellij

avec SDK 17 : jdk-17.0.3.1 (téléchargé sur Oracle)

Dans File > Project Structure... > Project Setting > Project > (définir le SDK)

avec lib javaFX : version windows 18.0.1 x64(https://gluonhq.com/products/javafx/)

Dans IntelliJ> Run > Edit Configurations...
Liste déroulante Modify options, cocher Add VM options
Renseigner ceci :
--module-path "C:\Program Files\Java\javafx-sdk-18.0.1\lib" --add-modules javafx.controls,javafx.fxml
