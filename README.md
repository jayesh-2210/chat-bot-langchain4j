# chat-bot-langchain4j

Requires Java 25 and an [OpenRouter API key](https://openrouter.ai/workspaces/default/keys).
The app reads the key from the `OPENROUTER_API_KEY` environment variable and uses
`openai/gpt-4o-mini` through `https://openrouter.ai/api/v1`.

For this project's delegated Maven runs in IntelliJ:

1. Open **Settings > Build, Execution, Deployment > Build Tools > Maven > Runner**.
2. In **Environment variables**, add `OPENROUTER_API_KEY` with your OpenRouter API key as its value.
   If you previously saved this key as `OPENAI_API_KEY`, rename that variable to `OPENROUTER_API_KEY`.
3. Apply the settings and run `App` again.

IntelliJ 2024.1 does not forward the App run configuration's environment variables
to delegated Maven runs. Set the variable on the Maven Runner as described above.
Keep the key out of source files, commits, screenshots, and chat messages.
