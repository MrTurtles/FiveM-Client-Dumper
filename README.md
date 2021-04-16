# FiveM Client Dumper
** THE ORIGINAL PROJECT IS NOW UNMAINTAINED. THIS MEANS IT WILL NOT BE UPDATED, ANSWER TO ISSUE REPORTS OR OFFER ANY KIND OF SUPPORT.
HOWEVER, I FORKED THE PROJECT TO MAINTAIN POSSIBLE ISSUES AND TRY TO HELP YOU.
[LICENSE] (https://github.com/marcodsl/FiveM-Client-Dumper/blob/master/LICENSE) STILL APPLIES. **

FiveM Client Dumper is an application that allows the user to obtain files on the client side of a FiveM server.

## How it works?

As described [here] (https://docs.fivem.net/docs/scripting-manual/nui-development/full-screen-nui/#developer-tools), the
FiveM's application exposes the Chrome Embedded Framework debugging tools at [127.0.0.1:13172▪(http://127.0.0.1:13172).
Thus, FiveM Client Dumper uses the [Chrome Devtools Protocol] (https://chromedevtools.github.io/devtools-protocol/)
to execute calls [`fetch ()`] (https://developer.mozilla.org/pt-BR/docs/Web/API/Fetch_API) that send the client files
to a local HTTP server. The received files are then saved to the disk.

## How to use

1. Make sure that the latest version of [JRE 64 bits] (https://www.oracle.com/java/technologies/javase-jre8-downloads.html) is installed.
2. Download the files from the [RELEASES] page (https://github.com/MrTurtles/FiveM-Client-Dumper/releases/tag/1.0.21).
3. Open FiveM and join the server whose client-side you want to obtain.
4. If the server address is a domain like: lifetimeroleplay.com open command prompt and enter command: "ping lifetimeroleplay.com" and copy the output IP address. Skip to step 7 if you've done this step.
5. Optional (RedEngine REQUIRED): Open RedEngine "Insert" or "F11" and go to executor
6. Optional (RedEngine REQUIRED): Enter this command in exec : print("IP: " .. GetCurrentServerEndpoint())
7. Run dumper.bat and enter IP and Port
8. Wait for the program to finish running.

#### Options
* `-a`: server's IP address
* `-p`: server port (default: 30120)
* `-o`: output folder of the files (default: server IP)

## Common questions

* ** Q: ** Can I be banned from FiveM for using the FiveM Client Dumper? ** R **: _No. The FiveM Client Dumper does not access
the memory of the FiveM process directly, so there are no risk of getting banned.

## License

The source code for the FiveM Client Dumper is licensed under the [GNU Affero General Public License v3.0] (https://github.com/marcodsl/FiveM-Client-Dumper/blob/master/LICENSE)
