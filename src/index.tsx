import { NativeModules } from 'react-native';

type ArLocalizerRnType = {
  createArView(value: string): Promise<boolean>;
};

const { ArLocalizerRn } = NativeModules;

export default ArLocalizerRn as ArLocalizerRnType;
