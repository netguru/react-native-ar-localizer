import * as React from 'react';
import { StyleSheet, View } from 'react-native';
import ArLocalizerRn from 'ar-localizer-rn';

export default function App() {
  React.useEffect(() => {
    ArLocalizerRn.createArView('../NetguruOffices.json');
  }, []);

  return <View style={styles.container} />;
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    alignItems: 'center',
    justifyContent: 'center',
  },
});
