'use strict';
import React from 'react';
import {
  AppRegistry,
  StyleSheet,
  Text,
  View
} from 'react-native';

import {
  StackNavigator,
} from 'react-navigation';

//常量
// const MainScreen extends React.Component{
//   Main:{screen: MainScreen},
//   Profile:{screen: ProfileScreen},
// }


class EssayJokeReactNativeDemo extends React.Component {
  render() {
    return (
      <View style={styles.container}>
        <Text style={styles.hello}>Hello, EssayJoke React-NativeDemo</Text>
      </View>
    )
  }
}
var styles = StyleSheet.create({
  container: {
    flex: 1,
    justifyContent: 'center',
  },
  hello: {
    fontSize: 20,
    textAlign: 'center',
    margin: 10,
  },
});
AppRegistry.registerComponent('EssayJokeReactNativeDemo', () => EssayJokeReactNativeDemo);