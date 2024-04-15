/**
 * Class that defines airplane speed.
 *
 * @author Ava Venturino
 * @version 1.0
 * @since 2024-04-09
 */

import { createPrompt } from 'bun-promptx'

function reverseString(str: string): string {
  if (str === "") {
    return str
  } else {
    return reverseString(str.substr(1)) + str[0]
  }
}

function main(): void {
  const aString: string = "recursion"

  console.log(`The original string is: ${aString}`);
  console.log(`The reverse string is: ${reverseString(aString)}`);

  console.log("\nDone.");
}

main()