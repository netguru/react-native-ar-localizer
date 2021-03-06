<div align="center">
  <h1>React Native AR Localizer</h1>
</div>

<div align="center">
  <image src="https://badge.fury.io/js/react-native-ar-localizer.svg"/>
  <image src="https://img.shields.io/npm/dt/react-native-ar-localizer"/>
</div>
<div align="center">
    <br/><em>Brought with</em> &nbsp;❤️ <em>by</em> &nbsp; <a href="https://www.netguru.com">
        <img align="center" alt="Netguru logo" src='./assets/readme_netguru_logo.png' width='30'/>
      </a>
</div>

## Introduction

<p align="center">
  React Native bridge for ARLocalizer
</p>

<div align="center">
  <a href="#Installation">Installation</a> &nbsp;|&nbsp; <a href="#Usage">Usage</a> &nbsp;|&nbsp; <a href="#Contributing">Contributing</a> &nbsp;|&nbsp; <a href="#Contributors">Contributors</a>
</div>

## Installation

Simply add package to your project
```sh
yarn add react-native-ar-localizer
```

## Usage
To use the package, you need to provide data with objects and theirs locations, check the `NetguruOffices.json` file from our example. Then, for example in App.tsx:
```js
import ArLocalizerRn from "react-native-ar-localizer";

// ...

React.useEffect(() => {
    ArLocalizerRn.createArView('../NetguruOffices.json');
  }, []);
```
### Example
The app shows distance from user's current location to defined location, example usage:

| Screenshot | Screen recording | 
| :------: | :------: | 
| ![Screenshot](./assets/ArLocalizerRn.jpg?raw=true) | ![Screen recording](./assets/readme_Usage.gif) |

## Contributing

See the [contributing guide](CONTRIBUTING.md) to learn how to contribute to the repository and the development workflow.

### Installation

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

## Contributors
<div>
<img alt="Pawel" style="border-radius: 30px; margin-right: 5px" src='./assets/readme_pawel@3x.png' width='60'/>

<img alt="Joanna" style="border-radius: 30px; margin-right: 5px" src='./assets/readme_joanna@3x.png' width='60'/>
</div>

## License

MIT
