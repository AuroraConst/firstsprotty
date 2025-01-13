import { defineConfig } from "vite";
import scalaJSPlugin from "@scala-js/vite-plugin-scalajs";
import path from 'path';
export default defineConfig({
  plugins: [scalaJSPlugin({
    cwd: "../../", // path to build.sbt
    projectID: "viteview" // scala.js project name in build.sbt
  })],
  resolve: {
    alias: {
      '@com.axiommd/secondsprotty': path.resolve(__dirname, 'node_modules/@com.axiommd/secondsprotty')
    }
  },
  build: {
    sourcemap: true // Enable source maps
    
  }
});