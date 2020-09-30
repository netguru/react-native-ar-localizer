import { NativeModules } from 'react-native';
import type { Location } from './index.d';

type ArLocalizerRnType = {
  createArView(points: Location[]): Promise<boolean>;
};

const { ArLocalizerRn } = NativeModules;

export default ArLocalizerRn as ArLocalizerRnType;
