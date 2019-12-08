# hotswap-dcevm-clojure-demo

To try out Hotswap-agent and DCEVM with Clojure, so that we can reload freshly compiled Java code without restarting the REPL.

## Usage

1. Download and unpack TravaOpenJDK from this page: https://github.com/TravaOpenJDK/trava-jdk-11-dcevm/releases/tag/dcevm-11.0.5%2B4
2. Define `JAVA_HOME` to point at the unpacked directory.
3. Launch the REPL and load the namespace `hotswap-dcevm-clojure-demo.core` a few times.
4. Edit the file `src/java/Mjao.java` and compile it using `lein javac`.
5. Load the  file `hotswap-dcevm-clojure-demo.core` again. 
6. Repeat step 4 and 5...
```
Mjao result (3): 13
Mjao result (3): 13
Mjao result (3): 13
HOTSWAP AGENT: 13:15:53.645 RELOAD (org.hotswap.agent.config.PluginManager) - Reloading classes [Mjao] (autoHotswap)
Mjao result (3): 103
Mjao result (3): 103
HOTSWAP AGENT: 13:16:08.070 RELOAD (org.hotswap.agent.config.PluginManager) - Reloading classes [Mjao] (autoHotswap)
Mjao result (3): 10003
user> 
```

## Summary
To have automatic class reloading in the REPL, these two things are needed:
  * A `resources/hotswap-agent.properties` file containing the line `autoHotswap=true`
  * `JAVA_HOME` environment variable pointing at the JDK [found here](https://github.com/TravaOpenJDK/trava-jdk-11-dcevm/releases/tag/dcevm-11.0.5%2B4), or newer.

## Documentation
  * Main page of the project: http://hotswapagent.org/
  * About the Hotswapper plugin: http://hotswapagent.org/mydoc_plugin_hotswapper.html
  * Example file of `hotswap-agent.properties`: https://github.com/HotswapProjects/HotswapAgent/blob/master/hotswap-agent-core/src/main/resources/hotswap-agent.properties

## License

Copyright © 2019 Jonas Östlund

This program and the accompanying materials are made available under the
terms of the Eclipse Public License 2.0 which is available at
http://www.eclipse.org/legal/epl-2.0.

This Source Code may also be made available under the following Secondary
Licenses when the conditions for such availability set forth in the Eclipse
Public License, v. 2.0 are satisfied: GNU General Public License as published by
the Free Software Foundation, either version 2 of the License, or (at your
option) any later version, with the GNU Classpath Exception which is available
at https://www.gnu.org/software/classpath/license.html.
