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

![Screenshot](ArLocalizerRn.jpg?raw=true)

## Contributing

See the [contributing guide](CONTRIBUTING.md) to learn how to contribute to the repository and the development workflow.

## License

MIT
