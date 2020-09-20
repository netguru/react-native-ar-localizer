# ar-localizer-rn

React Native bridge for ARLocalizer

## Installation

First step:
```sh
yarn bootstrap
```
Then:
```sh
yarn example ios
```
Or
```sh
yarn example android
```

## Usage
To use the package, you need to provide data with objects and theirs locations, check the `NetguruOffices.json` file from our example. Then, for example in App.tsx:
```js
import ArLocalizerRn from "ar-localizer-rn";

// ...

React.useEffect(() => {
    ArLocalizerRn.createArView('../NetguruOffices.json');
  }, []);
```
### Example
The app shows distance from user's current location to defined location, screenshot from android device:

![Screenshot](./assets/ArLocalizerRn.jpg?raw=true)

## Contributing

See the [contributing guide](CONTRIBUTING.md) to learn how to contribute to the repository and the development workflow.

## Contributors
<img alt="Pawel" style="border-radius: 30px; margin-right: 5px" src='./assets/readme_pawel@3x.png' width='60'/>

<img alt="Joanna" style="border-radius: 30px; margin-right: 5px" src='./assets/readme_joanna@3x.png' width='60'/>

## License

MIT
